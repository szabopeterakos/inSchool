package readerwriter;

public class Book {
    private Long id;
    private String author;
    private String title;

    public Book(Long id, String author, String title) {
        if (id == null || isEmpty(author) || isEmpty(title)) {
            throw new CouldNotConstructBookException("Failed to create book");
        }
        this.id = id;
        this.author = author;
        this.title = title;
    }

    private boolean isEmpty(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return id + ":" + author + ":" + title;
    }
}
