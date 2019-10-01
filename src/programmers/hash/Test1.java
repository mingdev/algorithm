/*
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 * 프로그래머스 (해시)
 * */

package programmers.hash;

import java.util.*;

public class Test1 {
    public static String solution1(String[] participant, String[] completion) {
        // 오름차순 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) return participant[i];
        }

        return participant[participant.length - 1];
    }

    public static String solution2(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        // getOrDefault 찾는 키가 존재 한다면 키 값 반환, 아니면 기본 값 반환
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(solution2(participant, completion));
    }
}
