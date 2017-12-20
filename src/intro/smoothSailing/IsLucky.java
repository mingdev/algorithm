/*
* Ticket numbers usually consist of an even number of digits.
* A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
* Given a ticket number n, determine if it's lucky or not.
* */
package intro.smoothSailing;

public class IsLucky {

  public static boolean isLucky(int n) {
    String num = Integer.toString(n);

    String frist = num.substring(0,num.length()/2);
    String second = num.substring(num.length()/2);

    int a=0 ,b =0;
    for (int i = 0; i < frist.length(); i++) {
      a += frist.charAt(i);
      b += second.charAt(i);
    }

    return (a == b) ? true : false;
  }

  public static void main(String[] args) {
    System.out.println(isLucky(239017));
  }
}
