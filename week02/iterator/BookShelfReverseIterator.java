package week02.iterator;

public class BookShelfReverseIterator implements Iterator {
  private BookShelf bookShelf;
  private int index;

  public BookShelfReverseIterator(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
    this.index = bookShelf.getLength();
  }

  @Override
  public boolean hasNext() {
    return index - 1 > -1;
  }

  @Override
  public Object next() {
    index--;
    return bookShelf.getBook(index);
  }

}
