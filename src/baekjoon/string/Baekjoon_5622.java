package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArray = br.readLine().toUpperCase().toCharArray();

        int totalCount = 0;
        for (int str : charArray) {
            if (str >= 65 && str <= 67) {
                totalCount += 3;
            } else if (str >= 68 && str <= 70) {
                totalCount += 4;
            } else if (str >= 71 && str <= 73) {
                totalCount += 5;
            } else if (str >= 74 && str <= 76) {
                totalCount += 6;
            } else if (str >= 77 && str <= 79) {
                totalCount += 7;
            } else if (str >= 80 && str <= 83) {
                totalCount += 8;
            } else if (str >= 84 && str <= 86) {
                totalCount += 9;
            } else if (str >= 87 && str <= 90) {
                totalCount += 10;
            }
        }

        System.out.println(totalCount);
    }
}
