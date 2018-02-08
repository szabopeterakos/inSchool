package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {
    private List<String> composer = new ArrayList();
    private int length;
    private List<String> performers = new ArrayList<>();
    private String title;

    public AudioFeatures(String title, int length, List<String> composer, List<String> performers) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
        if (length <= 0) {
            throw new IllegalArgumentException("invalid Length");

        }
        if (Validators.isEmpty(performers)) {
            throw new IllegalArgumentException("no Performer");
        }

        this.composer = composer;
        this.length = length;
        this.performers = performers;
        this.title = title;
    }

    public AudioFeatures(String title, int length, List<String> performers) {
        this(title, length, new ArrayList<>(), performers);
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getContributors() {
        List<String> temp = new ArrayList<>();
        for (String p : performers) {
            temp.add(p);
        }
        for (String c : composer) {
            temp.add(c);
        }
        return temp;
    }
}