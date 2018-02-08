package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {
    private List<Feature> features = new ArrayList<>();
    private int price;
    private String registrationNumber;

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public CatalogItem(String registrationNumber, int price, Feature... features) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        for (Feature feature : features) {
            this.features.add(feature);
        }
    }

    public int fullLengthAtOneItem() {
        int fullLength = 0;
        for (Feature feature : features) {
            if (feature instanceof AudioFeatures) {
                fullLength += ((AudioFeatures) feature).getLength();
            }
        }
        return fullLength;
    }

    public int numberOfPagesAtOneItem() {
        int numberOfPages = 0;
        for (Feature feature : features) {
            if (feature instanceof PrintedFeatures) {
                numberOfPages += ((PrintedFeatures) feature).getNumberOfPages();
            }
        }
        return numberOfPages;
    }

    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (Feature feature : features) {
            for (String contributor : feature.getContributors()) {
                contributors.add(contributor);
            }
        }
        return contributors;
    }

    public List<String> getTitles() {
        if (features.size() == 0) {
            throw new IllegalArgumentException("No features available!");
        }
        List<String> titleList = new ArrayList<>();
        for (Feature feature : features) {
            titleList.add(feature.getTitle());
        }
        return titleList;
    }

    public boolean hasAudioFeature() {
        boolean hasAudioFeature = false;
        for (Feature feature : features) {
            if (feature instanceof AudioFeatures) {
                hasAudioFeature = true;
            }
        }
        return hasAudioFeature;
    }

    public boolean hasPrintedFeature() {
        boolean hasPrintedFeature = false;
        for (Feature feature : features) {
            if (feature instanceof PrintedFeatures) {
                hasPrintedFeature = true;
            }
        }
        return hasPrintedFeature;
    }
}