/*
* You are given an array of integers. On each move you are allowed to increase exactly one of its element by one.
* Find the minimal number of moves required to obtain a strictly increasing sequence from the input.
* */

package intro.exploringTheWaters;

public class ArrayChange {

  static int arrayChange(int[] inputArray) {
    int moves = 0;
    for (int x = 1; x < inputArray.length; x++) {
      while (inputArray[x] <= inputArray[x - 1]) {
        moves++;
        inputArray[x]++;
      }
    }
    return moves;
  }

  public static void main(String[] args) {
    int[] inputArray = {2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15};

    System.out.println(arrayChange(inputArray));
  }

}
