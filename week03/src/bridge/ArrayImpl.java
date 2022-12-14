package bridge;

import java.util.ArrayList;

public class ArrayImpl<T> implements AbstractList<T> {
  private ArrayList<T> arr;

  public ArrayImpl() {
    arr = new ArrayList<T>();
  }

  @Override
  public void addElement(T obj) {
    arr.add(obj);
  }

  @Override
  public T deleteElement(int i) {
    T element = arr.get(i);
    arr.remove(i);
    return element;
  }

  @Override
  public T getElement(int i) {
    return arr.get(i);
  }

  @Override
  public int getElementSize() {
    return arr.size();
  }

  @Override
  public int insertElement(T obj, int i) {
    arr.add(i, obj);
    return 0;
  }

}
