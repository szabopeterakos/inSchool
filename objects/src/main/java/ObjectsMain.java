import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {
        class Book {
        }
        ;

        new Book();

        System.out.println(new Book());

        Book emptyBook = null;
        Book emptyBook2 = new Book();
        Book anotherBook = new Book();

        boolean books = anotherBook == emptyBook2;

        System.out.println(emptyBook);
        System.out.println(emptyBook2);
        System.out.println(books);
        System.out.println(anotherBook.getClass());
        System.out.println();

        Book[] book = {new Book(), new Book(), new Book()};

        List<Book> BookList = Arrays.asList(new Book(), new Book(), new Book());
        List<Book> emptyShelf = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            emptyShelf.add(new Book());
        }

        for(Book BB:emptyShelf){
            System.out.print(book+" ");
            //System.out.print(book.toString()+" "); // már van toStringelve csak üres vagy vmi ilyesmi.
        }
    }

}
