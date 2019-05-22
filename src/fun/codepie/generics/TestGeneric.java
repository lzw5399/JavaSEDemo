package fun.codepie.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TestGeneric {
  public static void main(String[] args) {
    var mc = new MyCollection<String>();

    List<String> x = new ArrayList<>();

    var y = new Vector<String>();
  }
}
