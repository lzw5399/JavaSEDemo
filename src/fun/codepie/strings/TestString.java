package fun.codepie.strings;

public class TestString {
  public static void main(String[] args) {
    String a = "aa";
    String b = "aa";
    String c = new String("aa");

    System.out.println(a == b);
    System.out.println(a == c);
    System.out.println(a.equals(c));

    System.out.println(a.hashCode() + "___" + b.hashCode() + "__" + c.hashCode());
  }
}
