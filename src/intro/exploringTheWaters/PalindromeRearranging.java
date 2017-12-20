/*
* Given a string, find out if its characters can be rearranged to form a palindrome.
* */

package intro.exploringTheWaters;

public class PalindromeRearranging {

  static boolean palindromeRearranging(String inputString) {
    // 알파벳 담는 배열
    int[] letters = new int[26];
    for (int i = 0; i < inputString.length(); i++) {
      letters[inputString.charAt(i) - 'a']++;
    }

    int odds = 0;

    for (int i = 0; i < 26; i++) {
      if (letters[i] % 2 == 1) {
        odds++;
      }
    }

    if (odds % 2 == inputString.length() % 2 && odds < 2) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    System.out.println(palindromeRearranging("zyyzzzzz"));
  }
}
