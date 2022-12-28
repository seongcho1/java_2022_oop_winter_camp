package bridge;

import java.util.LinkedList;

public class LinkedListImpl<T> implements AbstractList<T> {
  private LinkedList<T> list;

  public LinkedListImpl() {
    list = new LinkedList<T>();
  }

  @Override
  public void addElement(T obj) {
    list.add(obj);
  }

  @Override
  public T deleteElement(int i) {
    T element = list.get(i);
    list.remove(i);
    return element;
  }

  @Override
  public T getElement(int i) {
    return list.get(i);
  }

  @Override
  public int getElementSize() {
    return list.size();
  }

  @Override
  public int insertElement(T obj, int i) {
    list.add(i, obj);
    return 0;
  }
}
