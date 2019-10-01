package programmers.stackQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Test1 {
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<>();
        for (int i : priorities) {
            que.add(i);
        }

        Arrays.sort(priorities);
        int size = priorities.length - 1;

        while (!que.isEmpty()) {
            Integer i = que.poll();
            if (i == priorities[size - answer]) {
                answer++;
                l--;
                if (l < 0)
                    break;
            } else {
                que.add(i);
                l--;
                if (l < 0)
                    l = que.size() - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};

        System.out.println(solution(priorities, 0));
    }

}
