package fun.codepie.array;

import java.util.ArrayList;
import java.util.List;

public class ArraySample1 {
  public static void main(String[] args) {
    List<String> x = new ArrayList<String>();
    x.add("1");
    x.add("djsdjks");
    for (var item : x) {
      System.out.println(item);
    }
  }
}
