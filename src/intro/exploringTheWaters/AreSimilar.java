
/*
* Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.
* Given two arrays a and b, check whether they are similar.
* */
package intro.exploringTheWaters;

import java.util.Arrays;

public class AreSimilar {

  static boolean areSimilar(int[] a, int[] b) {
    int test = 0;
    for (int i = 0; i < a.length; i++)
      if (a[i] != b[i])
        test++;
    Arrays.sort(a);
    Arrays.sort(b);
    return test < 3 && Arrays.equals(a, b);
  }

  public static void main(String[] args) {
    int[] a = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
    int[] b = {832, 570, 148, 998, 533, 561, 455, 147, 894, 279};

    System.out.println(areSimilar(a, b));
  }
}
