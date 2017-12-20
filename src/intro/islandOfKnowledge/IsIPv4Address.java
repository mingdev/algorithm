/*
* IPv4 addresses are represented in dot-decimal notation,
* which consists of four decimal numbers,
* each ranging from 0 to 255 inclusive, separated by dots, e.g., 172.16.254.1.
*
* Given a string, find out if it satisfies the IPv4 address naming rules.
* */

package intro.islandOfKnowledge;

public class IsIPv4Address {

  static boolean isIPv4Address(String inputString) {

    String[] strings = inputString.split("\\.");

    if (strings.length != 4) return  false;

    for (int i =0; i< strings.length; ++i) {
      try {
        if (Integer.parseInt(strings[i])> 255) {
          return false;
        }
      } catch (NumberFormatException e) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    System.out.println(isIPv4Address("172.316.254.1")); //false
    System.out.println(isIPv4Address("172.16.254.1"));  //true
    System.out.println(isIPv4Address(".254.255.0"));    //false
  }
}
