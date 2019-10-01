package programmers.hash;

import java.util.*;

public class Test4 {
    public static int[] solution(String[] genres, int[] plays) {
        // Key-Value(Map)
        Map<Integer, String> gMap = new HashMap<>();
        Map<Integer, Integer> pMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            gMap.put(i, genres[i]);
            pMap.put(i, plays[i]);
        }

        Set<String> gSet = new HashSet<>(Arrays.asList(genres));

        Map<Integer, String> totalPlay = new TreeMap<>();

        for (String x : gSet) {
            int total = 0;
            for (int i = 0; i < gMap.size(); i++) {
                if (gMap.get(i).equals(x)) {
                    total += pMap.get(i);
                }
            }
            totalPlay.put(total, x);
        }

        String[] sortGenre = new String[gSet.size()];
        int idx = 0;
        for (Object o : totalPlay.keySet()) {
            sortGenre[idx] = totalPlay.get(o).toString();
            idx++;
        }

        //장르별 많이 플레이 된 노래의 고유번호 찾기
        ArrayList<Integer> fIndex = new ArrayList<>();
        for (int i = sortGenre.length - 1; i >= 0; i--) {
            int count = 0;
            for (int p1 : gMap.keySet()) {
                if (sortGenre[i].equals(gMap.get(p1))) {
                    count++;
                }
            }

            int[] temp = new int[count];
            int k = 0;
            for (int p2 : gMap.keySet()) {
                if (sortGenre[i].equals(gMap.get(p2))) {
                    temp[k] = pMap.get(p2);
                    k++;
                }
            }

            if (temp.length != 1) {
                Arrays.sort(temp);
                for (int j = temp.length - 1; j >= temp.length - 2; j--) {
                    for (int p : pMap.keySet()) {
                        if (temp[j] == pMap.get(p)) {
                            fIndex.add(p);
                            pMap.put(p, 0);
                            break;
                        }
                    }
                }
            } else {
                for (int p : pMap.keySet()) {
                    if (temp[0] == pMap.get(p)) {
                        fIndex.add(p);
                        pMap.put(p, 0);
                        break;
                    }
                }
            }
        }

        int[] answer = new int[fIndex.size()];

        for (int i = 0; i < fIndex.size(); i++) {
            answer[i] = fIndex.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        // [4,1,3,0] 결과 값
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        System.out.println(Arrays.toString(solution(genres, plays)));
    }
}
