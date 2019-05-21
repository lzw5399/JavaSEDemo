package fun.codepie.generics;

public class MyCollection<T> {
  Object[] objs = new Object[5];

  public void set(T obj, int index) {
    objs[index] = obj;
  }

  public T get(int index) {
    return (T) objs[index];
  }
}
