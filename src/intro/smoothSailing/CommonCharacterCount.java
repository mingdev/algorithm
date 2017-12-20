package intro.smoothSailing;

public class CommonCharacterCount {

  public static int commonCharacterCount(String s1, String s2) {
    int result = 0;

    char[] string1 = s1.toCharArray();
    char[] string2 = s2.toCharArray();

    for(int i=0; i < string1.length; i++) {
      for (int j=0; j < string2.length; j++) {
        if (string1[i] == string2[j]) {
          string1[i] = 0;
          string2[j] = 0;
          result++;
          break;
        }
      }
    }

    return result;
  }

  static int commonCharacterCount2(String s1, String s2) {
    int[] a = new int[26],
        b = new int[26];
    for (char c: s1.toCharArray())
      a[c - 'a']++;
    for (char c: s2.toCharArray())
      b[c - 'a']++;
    int s = 0;
    for (int i = 0; i < 26; ++i)
      s +=Math.min(a[i],b[i]);
    return s;
  }


  public static void main(String[] args) {
    String s1 = "aabcc";
    String s2 = "adcaa";

    System.out.println(commonCharacterCount2(s1,s2));

  }
}
