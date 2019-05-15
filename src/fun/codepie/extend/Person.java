package fun.codepie.extend;

/** 测试继承与重写 */
public class Person {
  private String name;
  public int height;

  public void hello() {
    System.out.println("hello from person");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
