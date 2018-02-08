package searching;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookArraySearch {

    private Book[] bookArrays;

    public BookArraySearch(Book[] bookArray) {
        this.bookArrays = bookArray;
    }

    public Book findBookByAuthorTitle(String author, String title) {
        // index keresés
        if (isValid(author) || isValid(title)) {
            throw new IllegalArgumentException("Author or title must not be empty!");
        }

        List<Book> temp = Arrays.asList(bookArrays);
        Book bookKey = new Book(title, author); // this is what we searching for
        int index = -1;


        Collections.sort(temp); // rendezés a bináris kereséshez
        index = Collections.binarySearch(temp,bookKey);


        if (index < 0) {
            throw new IllegalArgumentException("No book found by " + author + " with title " + title);
        }

        return bookArrays[index];
    }

    public boolean isValid(String str) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("Author or title must not be empty!");
        }
        return false;
    }
}
