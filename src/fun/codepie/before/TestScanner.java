package fun.codepie.before;

import java.util.Scanner;

/** 使用Scanner获取键盘输入 */
public class TestScanner {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入名字");
    var name = scanner.nextLine();
    System.out.println("请输入年龄");
    var age = scanner.nextInt();
    System.out.println("#####s###########");
    System.out.println("名字:" + name);
    System.out.println("年龄:" + age);
  }
}
