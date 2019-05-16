package fun.codepie.InnerClass;

public class TestOuterInner {
  public static void main(String[] args) {
    // var x = new OuterClass().new InnerClass();
    var out =
        new NoNameInner() {
          void e() {
            System.out.println("2");
          }

          @Override
          void show() {
            System.out.println("重写后");
          }
        };
    out.e();
    out.show();

    var noNameInterface =
        new NoNameInterface() {
          public void show2() {
            System.out.println("实现接口的匿名内部类");
          }
        };
    noNameInterface.show2();
  }
}
