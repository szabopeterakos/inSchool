package genericinterface.book;

import genericinterface.SearchCriteria;

public class BookTitleSearchCriteria implements SearchCriteria<Book> {

    private String title;

    public BookTitleSearchCriteria(String title) {
        this.title = title;
    }

    @Override
    public boolean pass(Book target) {
        if (target.getTitle().equals(title)) {
            return true;
        }
        return false;
    }
}
