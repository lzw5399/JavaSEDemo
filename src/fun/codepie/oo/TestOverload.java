package fun.codepie.oo;

public class TestOverload extends TestFather {
  public TestOverload(int a) {
    this(a, 2);
  }

  public TestOverload(int a, int b) {
    super(a);
  }
}
