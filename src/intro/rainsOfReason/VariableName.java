package intro.rainsOfReason;

public class VariableName {

  public static boolean variableName(String name) {
    return name.matches("^[a-zA-Z_]+[a-zA-Z0-9_]*$");
  }


  public static void main(String[] args) {
    System.out.println(variableName("2w2"));
  }

}
