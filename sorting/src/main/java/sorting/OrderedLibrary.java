package sorting;

import java.util.Set;
import java.util.TreeSet;

public class OrderedLibrary {

    private Set<Book> library = new TreeSet<>();

    public OrderedLibrary(Set<Book> library) {
        this.library = library;
    }

    public Book lendFirstBook(){
        if(library.size()==0){
            throw  new NullPointerException("Libray is empty!");
        }

        return (Book)library.toArray()[0];
    }

}
