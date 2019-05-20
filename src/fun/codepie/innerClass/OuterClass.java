package fun.codepie.innerClass;

public class OuterClass {
  public int name;

  public OuterClass() {
    System.out.println("调用了外部类");
  }

  public class InnerClass {
    public InnerClass() {
      System.out.println("调用了内部类");
    }

    int age;
  }
}
