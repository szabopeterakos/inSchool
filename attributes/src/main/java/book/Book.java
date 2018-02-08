package book;

public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        Book bk = new Book("a könyv címe");
        System.out.println(bk.getTitle());
        bk.setTitle("átnevezve");
        System.out.println(bk.getTitle());
    }
}
