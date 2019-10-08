package programmers.kakao2020;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Exam1 {
    // aabbaccc -> 2a2ba3c (7)
    // ababcdcdababcdcd -> 2ababcdcd (9)
    // abcabcabcabcdededededede -> 14
    static public int solution(String s) {
        int answer = 0;
        int N = s.length();

        if (s.length() == 1) {
            return 1;
        } else {
            for (int i = 1; i < s.length() + 1; i++) {
                String temp = s;

                int begin = 0, end = begin + i;
                String[] subStr = new String[N];


                for (int j = 0; j < s.length(); j++) {
                    subStr[j] = temp.substring(begin, end);
                    temp = temp.substring(end);
                    System.out.println(subStr[j]);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        String s = token.nextToken();

        System.out.println(solution(s));
    }
}
