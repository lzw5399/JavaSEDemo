/** 转义字符测试 */
public class Escapes {
  public static void main(String[] args) {
    var a = 6 & 11;
    System.out.println(a);
    var b = 6 | 11;
    System.out.println(b);
    var c = 6 ^ 11;
    System.out.println(c);

    System.out.println(1 << 10);

    System.out.println(1024 >> 10);

    System.out.println(~6);
  }
}
