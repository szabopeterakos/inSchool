package genericinterface;

import genericinterface.book.Book;
import genericinterface.book.BookAuthorSearchCriteria;
import genericinterface.book.BookTitleSearchCriteria;
import genericinterface.search.SearchService;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class LibraryTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    public static final List<Book> BOOKS = Arrays.asList(
            new Book("Gárdonyi Géza", "Egri csillagok"),
            new Book("Szophoklész", "Antigoné"));

    @Test
    public void shouldThrowExceptionIfBookNotPresent() {
        exception.expect(IllegalArgumentException.class);
        new SearchService<Book>().findFirst(BOOKS, new BookTitleSearchCriteria("Cinderella"));
    }

    @Test
    public void shouldFindAndReturnBookByTitle() {
        Book book = new SearchService<Book>().findFirst(BOOKS, new BookTitleSearchCriteria("Egri csillagok"));

        assertThat(book.getAuthor(), equalTo("Gárdonyi Géza"));
        assertThat(book.getTitle(), equalTo("Egri csillagok"));
    }

    @Test
    public void shouldFindAndReturnBookByAuthor() {
        Book book = new SearchService<Book>().findFirst(BOOKS, new BookAuthorSearchCriteria("Szophoklész"));

        assertThat(book.getTitle(), equalTo("Antigoné"));
    }


}
