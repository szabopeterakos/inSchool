package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    public List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }
        catalogItems.add(item);
    }

    public double averagePageNumberOver(int number) {
        double average = 0;
        int counter = 0;
        for (CatalogItem item : catalogItems) {
            for (Feature feature : item.getFeatures()) {
                if (feature instanceof PrintedFeatures && ((PrintedFeatures) feature).getNumberOfPages() > number) {
                    average += ((PrintedFeatures) feature).getNumberOfPages();
                    counter++;
                }
            }
        }
        return average / counter;
    }

    public void deleteItemByRegistrationNumber(String item) {
        catalogItems.removeIf(catalogItem -> catalogItem.getRegistrationNumber().equals(item));
    }

    public List<CatalogItem> findByCriteria(SearchCriteria src) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        List<CatalogItem> items = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            for (Feature feature : catalogItem.getFeatures()) {
                boolean contributorIsTheSame = true;
                boolean titleIsTheSame = true;
                if (src.hasContributor() && !feature.getContributors().contains(src.getContributor())) {
                    contributorIsTheSame = false;
                }
                if (src.hasTitle() && !feature.getTitle().equals(src.getTitle())) {
                    titleIsTheSame = false;
                }
                if (contributorIsTheSame && titleIsTheSame) {
                    items.add(catalogItem);
                }
            }
        }
        return items;
    }

    public int getAllPageNumber() {
        int pageNumber = 0;
        for (CatalogItem item : catalogItems) {
            for (Feature feature : item.getFeatures()) {
                if (feature instanceof PrintedFeatures) {
                    pageNumber += ((PrintedFeatures) feature).getNumberOfPages();
                }
            }
        }
        return pageNumber;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> audioItems = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            for (Feature feature : catalogItem.getFeatures()) {
                if (feature instanceof AudioFeatures) {
                    audioItems.add(catalogItem);
                    break;
                }
            }
        }
        return audioItems;
    }

    public int getFullLength() {
        int fullLength = 0;
        for (CatalogItem item : catalogItems) {
            for (Feature feature : item.getFeatures()) {
                if (feature instanceof AudioFeatures) {
                    fullLength += ((AudioFeatures) feature).getLength();
                }
            }
        }
        return fullLength;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> printedItems = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            for (Feature feature : catalogItem.getFeatures()) {
                if (feature instanceof PrintedFeatures) {
                    printedItems.add(catalogItem);
                    break;
                }
            }
        }
        return printedItems;
    }
}