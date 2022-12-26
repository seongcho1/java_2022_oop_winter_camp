package Concret;

import Factory.IteratorFactory;
import Interface.Aggregate;
import Interface.Iterator;
import Enum.IteratorType;
import Interface.ReverseIterator;

final public class BookShelf implements Aggregate {

    final private IteratorFactory factory;
    final private Book[] bookArray;
    private int currentIndex;

    public BookShelf(int size) {
        this.factory = new IteratorFactory();
        this.bookArray = new Book[size];
    }

    public void appendBook(Book book) { this.bookArray[currentIndex++] = book; }

    @Override
    public int getLength() { return this.currentIndex; }

    @Override
    public Object at(int index) { return bookArray[index]; }

    @Override
    public Iterator CreateIterator() {
        return factory.create(this, IteratorType.FORWARD);
    }

    @Override
    public ReverseIterator CreateReverseIterator() {
        return (ReverseIterator)(factory.create(this, IteratorType.REVERSE));
    }
}
