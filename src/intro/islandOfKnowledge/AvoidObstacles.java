/*
* You are given an array of integers representing coordinates of obstacles situated on a straight line.
*
* Assume that you are jumping from the point with coordinate 0 to the right.
*
* You are allowed only to make jumps of the same length represented by some integer.
*
* Find the minimal length of the jump enough to avoid all the obstacles.
* */

package intro.islandOfKnowledge;

import java.util.Arrays;

public class AvoidObstacles {

  static int avoidObstacles(int[] inputArray) {
    Arrays.sort(inputArray);

    int[] distance = new int[100];

    for (int i = 0; i < inputArray.length; i++) {
      int idx = inputArray[i];
      distance[idx] = 1;
    }

    for (int i = 1; i <= distance.length; i++) {
      int a = i;
      while (true) {
        if (i > inputArray[inputArray.length - 1]) {
          return a;
        }
        if (distance[i] == 1) {
          i = a;
          break;
        }
        i += a;
      }
    }
    return 0;
  }

  static int avoidObstacles_another(int[] inputArray) {

    int jump = 1;
    boolean fail = true;

    while(fail) {
      jump++;
      fail = false;
      for(int i=0; i<inputArray.length; i++)
        if(inputArray[i]%jump==0) {
          fail = true;
          break;
        }
    }

    return jump;
  }


  public static void main(String[] args) {
    int[] inputArray = {2, 3};

    System.out.println(avoidObstacles(inputArray));
  }
}
