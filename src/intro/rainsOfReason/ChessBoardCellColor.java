package intro.rainsOfReason;

public class ChessBoardCellColor {
  public static boolean chessBoardCellColor(String cell1, String cell2) {
    return Math.abs(cell1.charAt(0) - cell2.charAt(0)) % 2 == Math.abs(cell1.charAt(1) - cell2.charAt(1)) % 2;
  }

  public static void main(String[] args) {
    chessBoardCellColor("A1","B2");
  }
}
