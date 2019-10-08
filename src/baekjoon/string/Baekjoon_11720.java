package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());

        token = new StringTokenizer(br.readLine());

        String str = token.nextToken();

        if (str.length() != N) {
            System.exit(0);
        }

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - 48;
        }

        System.out.println(sum);

    }
}
