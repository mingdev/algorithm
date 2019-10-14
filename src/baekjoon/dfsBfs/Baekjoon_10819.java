package baekjoon.dfsBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10819 {

    public static int solution(int[] arr) {

        return 0;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];

        StringTokenizer token = new StringTokenizer(br.readLine()," ");
        int i = 0;
        while (token.hasMoreTokens()) {
            arr[i++] = Integer.parseInt(token.nextToken());
        }
    }
}
