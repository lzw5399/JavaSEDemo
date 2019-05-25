package fun.codepie.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ForeachList {
  public static void main(String[] args) {
    var al = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      al.add(i);
    }
    for (Iterator<Integer> iterator = al.iterator(); iterator.hasNext(); ) {
      Integer next = iterator.next();
      System.out.println(next);
    }

    for (Integer integer : al) {}
  }
}
