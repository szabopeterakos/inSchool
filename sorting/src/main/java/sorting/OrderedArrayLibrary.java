package sorting;

import java.util.Arrays;


public class OrderedArrayLibrary {
    private Book[] bookArray;

    public OrderedArrayLibrary(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public Book[] sortingById() {
        Book[] temp = new Book[bookArray.length];
        System.arraycopy(bookArray, 0, temp, 0, bookArray.length);
        Arrays.sort(temp);
        return temp;
    }

    public Book[] sortingByTitle() {
        Book[] temp = new Book[bookArray.length];
        System.arraycopy(bookArray, 0, temp, 0, bookArray.length);
        Arrays.sort(temp, (o1, o2) -> {
            return o1.getTitle().compareTo(o2.getTitle());
        });
        return temp;
    }
}
