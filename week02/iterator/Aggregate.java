package week02.iterator;

public interface Aggregate {
  public abstract Iterator iterator();
  public abstract ReverseIterator reverseIterator();
  public int getLength();
}
