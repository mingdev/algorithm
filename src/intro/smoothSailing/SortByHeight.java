/*
* Some people are standing in a row in a park.
* There are trees between them which cannot be moved.
* Your task is to rearrange the people by their heights in a non-descending order without moving the trees.
*
* '-1' means tree.
* */

package intro.smoothSailing;

import java.util.Arrays;

public class SortByHeight {

  static int[] sortByHeight(int[] a) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == -1)
        continue;
      for (int j = i+1; j < a.length; j++) {
        if (a[j] == -1)
          continue;
        if (a[i] > a[j]) {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }

    return a;
  }


  public static void main(String[] args) {
     int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};

    System.out.println(Arrays.toString(sortByHeight(a)));
  }

}
