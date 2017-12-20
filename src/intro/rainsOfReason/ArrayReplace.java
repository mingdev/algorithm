package intro.rainsOfReason;

public class ArrayReplace {
  public static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
    for (int i = 0; i < inputArray.length; i++) {
      if (inputArray[i] == elemToReplace)
        inputArray[i] = substitutionElem;
    }

    return inputArray;
  }

  public static void main(String[] args) {
    int[] inputArray = {1, 2, 1};
    int elemToReplace = 1;
    int substitutionElem = 3;

    arrayReplace(inputArray,elemToReplace,substitutionElem);
  }
}
