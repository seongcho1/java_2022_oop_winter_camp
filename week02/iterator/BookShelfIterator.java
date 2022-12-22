package week02.iterator;

public class BookShelfIterator implements Iterator {
  private BookShelf bookShelf;
  private int index;

  public BookShelfIterator(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
    this.index = -1;
  }

  @Override
  public boolean hasNext() {
    return index + 1 < bookShelf.getLength();
  }

  @Override
  public Object next() {
    index++;
    return bookShelf.getBook(index);
  }

}
