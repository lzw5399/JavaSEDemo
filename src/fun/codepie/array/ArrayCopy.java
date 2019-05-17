package fun.codepie.array;

public class ArrayCopy {
  public static void main(String[] args) {
    var arr = new String[] {"yu", "we", "wq"};

    var arr2 = new String[3];
    System.arraycopy(arr, 0, arr2, 0, arr.length);

    for (var a : arr2) {
      System.out.println(a);
    }
    var arr3 = arr;

    System.out.println(arr.hashCode() + "__" + arr2.hashCode() + "__" + arr3.hashCode());
  }
}
