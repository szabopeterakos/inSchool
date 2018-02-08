package collectionscomp;

import java.text.CollationKey;
import java.text.Collator;
import java.util.*;

public class OrderedLibrary {

    List<Book> bookShelf = new ArrayList<>();

    public OrderedLibrary(List<Book> bookShelf) {
        this.bookShelf = bookShelf;
    }

    public List<Book> orderedByTitle(){
        List<Book> list = new ArrayList<>(bookShelf);
        Collections.sort(list);
        return list;
    }

    public List<Book> orderedByAuthor(){
        List<Book> list = new ArrayList<>(bookShelf);
        Comparator<Book> bookComparator = new AuthorComparator();
        Collections.sort(list,bookComparator);
        return list;
    }

    public List<String> orderedByTitleLocale(Locale locale) {
        List<String> orderedByTitles = new ArrayList<>();

        for (Book book: bookShelf) {
            orderedByTitles.add(book.getTitle());
        }

        Collator huCollator = Collator.getInstance(locale); // static Factory method
        //huCollator.setStrength(Collator.PRIMARY);
        Collections.sort(orderedByTitles, huCollator);

        return orderedByTitles;
    }


}
