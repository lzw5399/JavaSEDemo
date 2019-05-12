package fun.codepie.before;

import java.math.BigDecimal;

/** hello world */
public class HelloWorld {
  public static void main(String[] args) {
    var a = BigDecimal.valueOf(0.1);
    var b = BigDecimal.valueOf(1.0 / 10.0);

    System.out.println(a.equals(b));
  }
}
