package hust.soict.ite6.aims.media;


import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

    @Override
    public int compare(Media media1, Media media2) {
        // Compare by title in alphabetical order
        int titleComparison = media1.getTitle().compareToIgnoreCase(media2.getTitle());

        // If titles are the same, compare by cost in descending order
        if (titleComparison == 0) {
            return Float.compare(media2.getCost(), media1.getCost());
        }

        return titleComparison;
    }
}
