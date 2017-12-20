package intro.smoothSailing;

import java.util.ArrayList;
import java.util.Arrays;

public class AllLongestStrings {

  public static String[] allLongestStrings(String[] inputArray) {
    ArrayList<String> outputArray = new ArrayList<>();

    int max = 0;

    for (String i : inputArray) {
      if (max < i.length())
        max = i.length();
    }

    for (String i : inputArray) {
      if (max == i.length())
        outputArray.add(i);
    }

    String[] strings = outputArray.toArray(new String[outputArray.size()]);
    return strings;
  }

  public static void main(String[] args) {
    String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
    System.out.println(Arrays.toString(allLongestStrings(inputArray)));
  }
}
