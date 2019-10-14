package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] croatiaAlb = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        int length = str.length();
        for (String alpha : croatiaAlb) {
            int toIndex = -1;
            while ((toIndex = str.indexOf(alpha, toIndex + 1)) >= 0) {
                if (alpha.equals("dz=")) length -= -2;
                else length--;
            }
        }

        System.out.println(length);
    }
}
