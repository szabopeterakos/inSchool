package genericsusage.withoutgenerics;

import genericsusage.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List library = new ArrayList();

    public Book getFirstBook(List books) {
        if (books == null) {
            throw new NullPointerException();
        }
        if (books.size() == 0) {
            throw new IllegalArgumentException("Argument should not be empty");
        }

        this.library = books;

        try {
            Book b = (Book) library.get(0);
        } catch (ClassCastException cce) {
            throw new ClassCastException("Not a book");
        }

        return (Book) library.get(0);
    }

}
