package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionManager {

    private List<Book> library = new ArrayList<>();

    public CollectionManager(List<Book> library) {
        this.library = library;
    }

    public List<Book> createUnmodifiableLibrary() { //módosíthatatlan listát eredményez
        return Collections.unmodifiableList(library);
    }

    public List<Book> reverseLibrary() { //az eredeti lista másolatán dolgozik!
        List<Book> temp = new ArrayList<>(library);
        Collections.reverse(temp);
        return temp;
    }

    public Book getFirstBook() { //a legrégebbi (legkisebb id) könyvet adja vissza
        return Collections.min(library);
    }

    public Book getLastBook() { // a legújabb (legnagyobb id) könyvet adja vissza
        return Collections.max(library);
    }
}
