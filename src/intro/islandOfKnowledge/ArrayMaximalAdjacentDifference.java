/*
* Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.
* */

package intro.islandOfKnowledge;

public class ArrayMaximalAdjacentDifference {

  static int arrayMaximalAdjacentDifference(int[] inputArray) {
      int result = 0;

      for(int i = 0; i < inputArray.length -1; ++i) {
        if (result < Math.abs(inputArray[i] - inputArray[i+1]))
          result = Math.abs(inputArray[i] - inputArray[i+1]);
      }

      return result;
  }

  public static void main(String[] args) {
    int[] inputArray = {2, 4, 1, 0};

    System.out.println(arrayMaximalAdjacentDifference(inputArray));
  }

}
