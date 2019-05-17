package fun.codepie.Strings;

public class TestString2 {
  public static void main(String[] args) {
    String a = "java";
    a += " code";
    String b = "JaVa code";

    System.out.println(a.charAt(2));
    System.out.println(a.equalsIgnoreCase(b));
  }
}
