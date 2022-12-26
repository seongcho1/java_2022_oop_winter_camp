package week02.iterator;

public class BookShelfReverseIterator implements ReverseIterator {
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
  public boolean isDone() {
      return !hasNext();
  }

  @Override
  public Object next() {
    index--;
    return bookShelf.getBook(index);
  }

  @Override
  public Object first() {
    return bookShelf.getBook(bookShelf.getLength() - 1);
  }

  @Override
  public Object currentItem() {
    if (index < 0 || index >= bookShelf.getLength())
      throw new IncorrectIteratorIndexException("index=" + index);
    return bookShelf.getBook(index);
  }
}
