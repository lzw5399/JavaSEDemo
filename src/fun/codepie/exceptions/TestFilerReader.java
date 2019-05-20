package fun.codepie.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestFilerReader {
  public static void main(String[] args) {
    try {
      var reader = new FileReader("D:\\ee");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
