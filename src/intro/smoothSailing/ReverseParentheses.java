/*
* You have a string s that consists of English letters, punctuation marks, whitespace characters, and brackets.
* It is guaranteed that the parentheses in s form a regular bracket sequence.
*
* Your task is to reverse the strings contained in each pair of matching parentheses, starting from the innermost pair.
* The results string should not contain any parentheses.
*
* */

package intro.smoothSailing;

public class ReverseParentheses {

  static String reverseParentheses(String s) {
    int st = s.lastIndexOf('(');

    while (st != -1) {
      int ed = s.indexOf(')', st);
      String t = s.substring(0, st);
      t += new StringBuffer(s.substring(st + 1, ed)).reverse().toString();
      t += s.substring(ed + 1);
      s = t;
      st = s.lastIndexOf('(');
    }
    return s;
  }

  public static void main(String[] args) {
    String a = "Code(Cha(lle)nge)";
    reverseParentheses(a);
  }
}