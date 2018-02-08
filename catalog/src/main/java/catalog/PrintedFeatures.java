package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature {
    private List<String> authors = new ArrayList<>();
    private int numberOfPages;
    private String title;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        if(numberOfPages < 1){
            throw new IllegalArgumentException("Message");
        }
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Empty title");
        }
        if(Validators.isEmpty(authors)){
            throw new IllegalArgumentException("");
        }
        this.authors = authors;
        this.numberOfPages = numberOfPages;
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getContributors(){
        return authors;
    }
}