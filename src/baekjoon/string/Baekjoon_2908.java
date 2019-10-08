package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(String.valueOf(new StringBuffer(token.nextToken()).reverse()));
        int b = Integer.parseInt(String.valueOf(new StringBuffer(token.nextToken()).reverse()));

        System.out.println(Math.max(a, b));
    }
}
