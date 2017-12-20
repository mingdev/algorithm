package intro.throughTheFog;

public class CircleOfNumbers {
  public static int circleOfNumbers(int n, int firstNumber) {
    int N = n/2;

    return (N > firstNumber) ? (firstNumber + N) : (firstNumber - N);
  }

  public static void main(String[] args) {
    System.out.println(circleOfNumbers(10,7));
  }
}
