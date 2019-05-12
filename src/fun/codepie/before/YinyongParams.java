package fun.codepie.before;

public class YinyongParams {
  public static void main(String[] args) {
    var array = new int[] {1, 2, 3, 4, 5};
    test(array);

    System.out.println(array[1]);

    add1(1, 2, 3);
  }

  private static void test(int[] array) {
    array[1] = 999999;
  }

  private static void add1(int... ar) {
    System.out.println(ar.getClass().getName());
  }
}
