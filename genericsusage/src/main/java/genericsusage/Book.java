package genericsusage;

public class Book {
    private String title;

    public Book(String title) {
        if (title.length() != 0) {
            this.title = title;
        }
    }

    public String getTitle() {
        return title;
    }
}
