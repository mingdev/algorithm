package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int word = str.charAt(i) - 65;
            arr[word]++;
        }

        boolean dupl = false;
        int MAX_COUNT = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (MAX_COUNT < arr[i]) {
                MAX_COUNT = arr[i];
                index = i;
                dupl = false;
            } else if (MAX_COUNT == arr[i]) {
                dupl = true;
            }
        }


        if (dupl) {
            System.out.println("?");
        } else {
            System.out.println((char) (index + 65));
        }
    }
}
