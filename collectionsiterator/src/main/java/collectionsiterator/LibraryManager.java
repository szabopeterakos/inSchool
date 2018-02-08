package collectionsiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LibraryManager {

    Set<Book> bookSet = new HashSet<>();

    public LibraryManager(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }

    public Book findBookByRegNumber(int serial) {
        Book b = null;
        for (Iterator<Book> i = bookSet.iterator(); i.hasNext(); ) {
            Book c = i.next();
            if (c.getId() == serial) {
                return b = c;
            }
        }

            throw new MissingBookException("No books found with regnumber:");

    }

    public int removeBookByRegNumber(int serial){
        Book b = null;
        for (Iterator<Book> i = bookSet.iterator(); i.hasNext(); ) {
            Book c = i.next();
            if (c.getId() == serial) {
                bookSet.remove(c);
                return c.getId();
            }
        }

            throw new MissingBookException("No books found with regnumber:");

    }

    public int libraryBooksCount(){
        return bookSet.size();
    }

    public Set<Book> selectBooksByAuthor(String author){
        Set<Book> temp = new HashSet<>();
        for(Iterator<Book> i = bookSet.iterator(); i.hasNext();){
            Book b = i.next();
            if(b.getAuthor().equals(author)){
                temp.add(b);
            }
        }

        if(temp.size()==0){
            throw  new MissingBookException("No books found by");
        }

        return temp;

    }

}
