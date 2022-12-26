package Interface;

public interface Aggregate {
    Iterator CreateIterator();
    Iterator CreateReverseIterator();

    int getLength();
    Object at(int index);
}
