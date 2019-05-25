package fun.codepie.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
  public static void main(String[] args) {
    Map<String, String> tm = new TreeMap<String, String>();

    tm.put("3", "why");
    tm.put("1", "Hello");
    tm.put("2", "gaga");

    for (String item : tm.values()) {
      System.out.println(item);
    }
  }
}
