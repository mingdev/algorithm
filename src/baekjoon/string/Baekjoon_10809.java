package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        char[] strArr = token.nextToken().toCharArray();

        int[] resultArr = new int[26];
        Arrays.fill(resultArr, -1);

        for (int i = 0; i < resultArr.length; i++) {
            for (int j = 0; j < strArr.length; j++) {
                if (i == (strArr[j] - 97) && resultArr[i] == -1)
                    resultArr[i] = j;
            }
        }

        for (int i = 0; i < resultArr.length; i++) {
            if (i != resultArr.length - 1)
                System.out.print(resultArr[i] + " ");
            else
                System.out.print(resultArr[i]);

        }
    }
}
