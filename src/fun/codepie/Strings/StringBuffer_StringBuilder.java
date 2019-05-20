package fun.codepie.Strings;

public class StringBuffer_StringBuilder {
  public static void main(String[] args) {
    var stringBuilder = new StringBuilder("hello java");
    var stringBuffer = new StringBuffer("hello java");

    System.out.println(stringBuffer.equals(stringBuilder));
  }
}
