package hust.soict.ite6.test.media;

import hust.soict.ite6.aims.media.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        // Create instances of Book, DigitalVideoDisc, and CompactDisc
        Book book1 = new Book(1, "Book Title 1", "Book Category", 10.99f);
        book1.addAuthor("Author 1");
        Book book2 = new Book(2, "Book Title 2", "Book Category", 15.99f);
        book2.addAuthor("Author 2");
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("DVD Title 1", "DVD Category", "Director 1", 120, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("DVD Title 2", "DVD Category", "Director 2", 90, 14.99f);
        CompactDisc cd1 = new CompactDisc(3, "CD Title 1", "CD Category", 25.99f);
        cd1.addTrack(new Track("Track 1", 3));
        cd1.addTrack(new Track("Track 2", 4));
        CompactDisc cd2 = new CompactDisc(4, "CD Title 2", "CD Category", 18.99f);
        cd2.addTrack(new Track("Track 3", 5));
        cd2.addTrack(new Track("Track 4", 6));
        // Create a list of Media objects
        List<Media> mediaList = new ArrayList<>();
        mediaList.add(book1);
        mediaList.add(book2);
        mediaList.add(dvd1);
        mediaList.add(dvd2);
        mediaList.add(cd1);
        mediaList.add(cd2);
        // Display the unsorted media list
        System.out.println("Unsorted Media List:");
        displayMediaList(mediaList);
        Collections.sort(mediaList, Media.COMPARE_BY_TITLE_COST);
        System.out.println("\nSorted Media List by Title Cost");
        displayMediaList(mediaList);
        Collections.sort(mediaList, Media.COMPARE_BY_COST_TITLE);
        System.out.println("\nSorted Media List by Cost Title");
        displayMediaList(mediaList);
    }
    private static void displayMediaList(List<Media> mediaList) {
        for (Media item : mediaList) {
            System.out.println(item.toString());
        }
    }
}
