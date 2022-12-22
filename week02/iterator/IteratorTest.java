package week02.iterator;

public class IteratorTest {
  public static void main(String[] args) {
    try {
      BookShelf bookShelf = new BookShelf(4);
      bookShelf.appendBook(new Book("Around the World in 80 Days"));
      bookShelf.appendBook(new Book("Bible"));
      bookShelf.appendBook(new Book("Cinderella"));
      bookShelf.appendBook(new Book("Daddy-Long-Legs"));

      Iterator it = bookShelf.iterator();
      while (it.hasNext()) {
        Book book = (Book)it.next();
        System.out.println("" + book.getName());
      }
      System.out.println();

      Iterator rit = bookShelf.reverseIterator();
      while (rit.hasNext()) {
        Book book = (Book)rit.next();
        System.out.println("" + book.getName());
      }
      System.out.println();

      BookShelfIteratorFactory bsitFactory = new BookShelfIteratorFactory();

      Iterator it2 = bsitFactory.createProduct(bookShelf, 1);
      while (it2.hasNext()) {
        Book book = (Book)it2.next();
        System.out.println("" + book.getName());
      }
      System.out.println();
      Iterator rit2 = bsitFactory.createProduct(bookShelf, -1);
      while (rit2.hasNext()) {
        Book book = (Book)rit2.next();
        System.out.println("" + book.getName());
      }
      System.out.println();


    } catch(Exception e) {
      System.err.println("Exception occured: " + e);
    }
  }

}
