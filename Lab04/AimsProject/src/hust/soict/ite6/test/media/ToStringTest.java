package hust.soict.ite6.test.media;


import hust.soict.ite6.aims.media.*;

import java.util.ArrayList;
import java.util.List;

public class ToStringTest {
    public static void main(String[] args) {
        Book book = new Book(1, "Book Title", "Book Category", 10.99f);
        book.addAuthor("Author 1");
        book.addAuthor("Author 2");
        CompactDisc cd = new CompactDisc(2, "CD Title", "CD Category", 15.99f);
        cd.addTrack(new Track("Track 1", 3));
        cd.addTrack(new Track("Track 2", 4));
        cd.setDirector("CD Director");
        DigitalVideoDisc dvd = new DigitalVideoDisc("DVD Title", "DVD Category", "DVD director", 120, 19.99f);
        List<Media> mediaList = new ArrayList<>();
        mediaList.add(book);
        mediaList.add(cd);
        mediaList.add(dvd);
        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
    }
}
