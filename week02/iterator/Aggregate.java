package week02.iterator;

public interface Aggregate {
  public abstract Iterator iterator();
  public abstract Iterator reverseIterator();
  public int getLength();
}
