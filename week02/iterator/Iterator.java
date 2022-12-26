package week02.iterator;

public interface Iterator {
  public boolean hasNext();
  public boolean isDone();
  public Object next();
  public Object first();
  public Object currentItem();
}
