package genericsusage.withgenerics;

import genericsusage.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> bookList = new ArrayList<>();

    public Book getFirstBook(List<Book> books) {
        if (books == null) {
            throw new NullPointerException();
        }
        if (books.size() == 0) {
            throw new IllegalArgumentException("Argument should not be empty");
        }
        this.bookList = books;

        return bookList.get(0);
    }

}
