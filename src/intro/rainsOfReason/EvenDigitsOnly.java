package intro.rainsOfReason;

public class EvenDigitsOnly {
  public static boolean evenDigitsOnly(int n) {
    String str = String.valueOf(n);

    for (int i = 0; i < str.length(); i++) {
      if(str.charAt(i)%2 !=0)
        return false;
    }
    return true;
  }

  public static boolean evenDigitsOnly_1(int n) {
    return Integer.toString(n).matches("(0|2|4|6|8)*");
  }

  public static boolean evenDigitsOnly_2(int n) {
    if (n == 0) {
      return true;
    }
    if (n % 2 != 0) {
      return false;
    }
    return evenDigitsOnly(n / 10);
  }

  public static void main(String[] args) {
    System.out.println(evenDigitsOnly(24423));
  }

}
