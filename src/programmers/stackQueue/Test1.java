package programmers.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test1 {
    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();

        // 진행일자에 대해서 Queue에 순서대로 넣어주기
        for (int i = 0; i < progresses.length; i++) {
            // 나머지 올림 처리
            double remain = (100 - progresses[i]) / speeds[i];
            int date = (int) Math.ceil(remain);

            queue.add(date);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        int prv_value = queue.poll();
        int cnt = 1;

        do {
            int value = queue.poll();

            if (prv_value < value) {
                prv_value = value;
                ans.add(cnt);
                cnt = 1;
            } else {
                cnt++;

            }

            if (queue.isEmpty()) {
                ans.add(cnt);
            }

        } while (!queue.isEmpty());

        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer token = new StringTokenizer(br.readLine(), " ");


        int[] progresses = {40, 93, 30, 55, 60, 65};
        int[] speeds = {60, 1, 30, 5, 10, 7};
        // return {2,1}
        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }
}
