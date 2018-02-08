package objectclass;

public class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return getAuthor() + " " + getTitle();
    }

    @Override
    public boolean equals(Object book) {
        if (book == null || getClass() != book.getClass()) {
            return false;
        }

        Book temp = (Book)book;

        if (getAuthor().equals(temp.getAuthor()) && getTitle().equals(temp.getTitle())) {
            return true;
        }

        return false;
    }


    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}