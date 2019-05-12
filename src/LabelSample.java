public class LabelSample {
  public static void main(String args[]) {
    Label1:
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (i == 5) {
          continue Label1;
        }
      }
      System.out.println(i);
    }
  }
}
