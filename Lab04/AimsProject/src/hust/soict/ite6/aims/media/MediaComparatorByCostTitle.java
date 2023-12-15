package hust.soict.ite6.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

    @Override
    public int compare(Media media1, Media media2) {
        // Compare by cost in descending order
        int costComparison = Float.compare(media2.getCost(), media1.getCost());

        // If costs are the same, compare by title in alphabetical order
        if (costComparison == 0) {
            return media1.getTitle().compareToIgnoreCase(media2.getTitle());
        }

        return costComparison;
    }
}
