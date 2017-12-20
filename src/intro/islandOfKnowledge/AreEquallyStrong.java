/*
* Call two arms equally strong if the heaviest weights they each are able to lift are equal.
*
* Call two people equally strong if their strongest arms are equally strong
* (the strongest arm can be both the right and the left), and so are their weakest arms.
*
* Given your and your friend's arms' lifting capabilities find out if you two are equally strong.
*
* */

package intro.islandOfKnowledge;

public class AreEquallyStrong {

  static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
    int yourArms = yourLeft + yourRight;
    int friendArms = friendsLeft + friendsRight;

    return (yourArms == friendArms && (yourLeft == (friendsLeft) || yourLeft ==(friendsRight)) && (yourRight == (friendsLeft) || (yourRight ==(friendsRight)))) ? true : false;
  }

  public static void main(String[] args) {
    System.out.println(areEquallyStrong(10,15,15,9));
  }
}
