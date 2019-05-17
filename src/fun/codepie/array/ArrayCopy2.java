package fun.codepie.array;

public class ArrayCopy2 {
  public static void main(String[] args) {
    var array = new String[] {"index0", "index1", "index2", "index3", "index4"};
    var arr2 = removeElement(array, 1);
    for (var a : arr2) {
      System.out.println(a);
    }
  }

  /** 删除指定索引的元素 本质上还是数组的拷贝 返回的源对象 */
  private static String[] removeElement(String[] array, int index) {
    System.arraycopy(array, index + 1, array, index, array.length - index - 1);
    array[array.length - 1] = null;

    return array;
  }
}
