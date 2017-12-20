package intro.throughTheFog;

public class AbsoluteValuesSumMinimization {

  public static int absoluteValuesSumMinimization(int[] a) {
    int curSum = Integer.MAX_VALUE;
    int index = 0;
    for(int i = 0; i < a.length; i++){
      int x = a[i];
      int sum = 0;
      for(int j = 0; j < a.length; j++){
        sum += Math.abs(a[j] - x);
      }
      if(sum < curSum){
        curSum = sum;
        index = i;
      }
    }
    return a[index];
  }

  public static void main(String[] args) {
      int[] a = {-10, -10, -10, -10, -10, -9, -9, -9, -8, -8, -7, -6, -5, -4, -3, -2, -1, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };

    System.out.println(absoluteValuesSumMinimization(a));
  }

}
