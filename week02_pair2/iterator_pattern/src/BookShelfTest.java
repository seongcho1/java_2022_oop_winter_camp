import Concret.Book;
import Concret.BookShelf;
import Interface.Iterator;
import Interface.ReverseIterator;

import java.util.ArrayList;

public class BookShelfTest {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        Iterator iterator = bookShelf.CreateIterator();
        ReverseIterator reverseIterator = bookShelf.CreateReverseIterator();

        try { System.out.println(iterator.CurrentItem()); }
        catch (Exception e) { System.out.println(e); }

        try { System.out.println(reverseIterator.CurrentItem()); }
        catch (Exception e) { System.out.println(e); }

        System.out.println("=============================================");

        while (!iterator.isDone()) {
            System.out.println(iterator.Next());
        }

        System.out.println("=============================================");

        while (!reverseIterator.isDone()) {
            System.out.println(reverseIterator.Next());
        }

        System.out.println("=============================================");

        System.out.println(iterator.First());
        System.out.println(reverseIterator.CurrentItem());

        System.out.println(reverseIterator.First());
        System.out.println(iterator.CurrentItem());




        ArrayList<String> test = new ArrayList<>();
        test.add("a");
        test.add("b");
        test.add("c");
        test.add("d");
        var it = test.iterator();





    }
}
