package fun.codepie.array;

import java.util.Arrays;

/** 测试java.util.Arrays工具类 */
public class TestArrays {
  public static void main(String[] args) {
    int[] array = {5, 67, 14, 200};
    Arrays.sort(array);

    System.out.println(Arrays.toString(array));

    System.out.println(Arrays.binarySearch(array, 999));
  }
}
