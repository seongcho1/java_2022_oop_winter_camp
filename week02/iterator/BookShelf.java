package week02.iterator;

public class BookShelf implements Aggregate{
  private Book[] books;
  private int index;
  private int size;

  public BookShelf(int size) {
    //books=new ArrayList<Book>(size);
    this.size = size;
    books = new Book[size];
    index = -1;

  }
  public void appendBook(Book book) {
    //books.add(book);
    index++;
    if (index < size)
      books[index] = book;
  }
  public Book getBook(int index) {
    if (index < 0 || index >= size) return null;
    return books[index];
  }

  @Override
  public Iterator iterator() {
    return new BookShelfIterator(this);
  }

  @Override
  public Iterator reverseIterator() {
    return new BookShelfReverseIterator(this);
  }


  @Override
  public int getLength() {
    return books.length;
  }


}
