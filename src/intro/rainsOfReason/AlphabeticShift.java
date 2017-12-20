package intro.rainsOfReason;

public class AlphabeticShift {

  public static String alphabeticShift(String inputString) {
    String str = "";

    for (int i = 0; i < inputString.length(); i++) {
      if (inputString.charAt(i) == 'z') {
        str += 'a';
      } else {
        str += (char) (inputString.charAt(i) + 1);
      }
    }

    return str;
  }


  public static void main(String[] args) {
    System.out.println(alphabeticShift("crazy"));
  }
}
