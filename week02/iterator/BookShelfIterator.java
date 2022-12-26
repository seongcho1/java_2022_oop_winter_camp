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
  public boolean isDone() {
      return !hasNext();
  }

  @Override
  public Object next() {
    index++;
    return bookShelf.getBook(index);
  }

  @Override
  public Object first() {
    return bookShelf.getBook(0);
  }

  @Override
  public Object currentItem() {
    if (index < 0 || index >= bookShelf.getLength())
      throw new IncorrectIteratorIndexException("index=" + index);
    return bookShelf.getBook(index);
  }
}
