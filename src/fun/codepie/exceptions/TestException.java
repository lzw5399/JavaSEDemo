package fun.codepie.exceptions;

public class TestException {
  public static void main(String[] args) {

    var a = 1;
    var b = 0;

    try {
      var c = a / b;

    } catch (Error ex) {
      System.out.println(ex.getMessage());
      System.out.println();
      for (var e : ex.getStackTrace()) {
        System.out.println(e);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  static void test() throws Exception {
    var a = 1;
    var b = 0;
    var c = a / b;
  }
}
