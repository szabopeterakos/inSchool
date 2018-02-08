package genericinterface.book;

import genericinterface.SearchCriteria;

public class BookAuthorSearchCriteria implements SearchCriteria<Book> {

    private String author;

    public BookAuthorSearchCriteria(String author) {
        this.author = author;
    }

    @Override
    public boolean pass(Book target) {
        if(target.getAuthor().equals(author)){
            return true;
        }
        return false;
    }
}
