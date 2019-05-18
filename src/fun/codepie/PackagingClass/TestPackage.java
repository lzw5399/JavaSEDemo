package fun.codepie.PackagingClass;

import java.math.BigDecimal;

public class TestPackage {
  public static void main(String[] args) {
    Integer i = new Integer(3);
    Integer j = Integer.valueOf(4);
    var y = j.intValue();
    System.out.println(Integer.MAX_VALUE);

    String str1 = "hello" + "java";
    String str2 = "hellojava";

    String str3 = "hello";
    String str4 = "java";
    String str5 = str3 + str4;
    System.out.println(str1 == str2);
    System.out.println(str2.equals(str5));
  }
}
