package catalog;

public class SearchCriteria {

    private String contributor;
    private String title;

    public static SearchCriteria createByBoth(String a, String b) {
        if (Validators.isBlank(a) || Validators.isBlank(b)) {
            throw new IllegalArgumentException("Invalid Yes!!!");
        }

        return new SearchCriteria(b, a);
    }

    public static SearchCriteria createByContributor(String contrib) {
        if (Validators.isBlank(contrib)) {
            throw new IllegalArgumentException("Invalid Contributor");
        }

        return new SearchCriteria(contrib, null);
    }

    public static SearchCriteria createByTitle(String title) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Invalid Title");
        }

        return new SearchCriteria(null, title);
    }

    public boolean hasContributor() {
        if (Validators.isBlank(getContributor())) {
            return false;
        }
        return true;
    }

    public boolean hasTitle() {
        if (Validators.isBlank(getTitle())) {
            return false;
        }
        return true;
    }

    private SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }
}
