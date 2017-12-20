package intro.exploringTheWaters;

import java.util.Arrays;

public class AddBorder {

  static String[] addBorder(String[] picture) {
    String[] x = new String[picture.length + 2];
    char[] border = new char[picture[0].length() + 2];

    Arrays.fill(border,'*');
    x[0] = new String(border);
    x[x.length-1] = x[0];

    for (int i = 1; i < x.length-1; i++) {
      x[i] = '*' + picture[i-1] + '*';
    }

    return x;
  }


  public static void main(String[] args) {
    String[] strings = {"abc", "ded"};
    System.out.println(Arrays.toString(addBorder(strings)));
  }

}
