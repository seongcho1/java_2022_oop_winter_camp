package week02.iterator;

public class BookShelfIteratorFactory extends Factory {

  @Override
  protected Iterator createProduct(Aggregate list, int type) {
    Iterator it;
    BookShelf bookShelf;

    if (list instanceof BookShelf) {
      bookShelf = (BookShelf)list;
    } else throw new IncorrectBookShelfTypeException("list=" + list.toString());

    if (type == IteratorType.FORWARD.getValue())
      return new BookShelfIterator(bookShelf);
    else if (type == IteratorType.REVERSE.getValue())
      return new BookShelfReverseIterator(bookShelf);
    else
      throw new IncorrectIteratorTypeException("type=" + type);
  }
}
