package hust.soict.ite6.test.screen;

import hust.soict.ite6.aims.media.*;
import hust.soict.ite6.aims.screen.StoreScreen;
import hust.soict.ite6.aims.store.Store;

public class SCv2 {

    public static void main(String[] args) {

        CompactDisc newCd = new CompactDisc(101, "Relaxing Tunes", "Excellent", 8);
        newCd.addTrack(new Track("Nature Sounds", 15));
        newCd.addTrack(new Track("Serenade", 25));

        DigitalVideoDisc newDvd1 = new DigitalVideoDisc("Love Story", "Romance", "Heartwarming Moments", 130, 70);
        DigitalVideoDisc newDvd2 = new DigitalVideoDisc("Adventure Quest", "Adventure", "Epic Journey", 110, 65);
        DigitalVideoDisc newDvd3 = new DigitalVideoDisc("Comedy Gala", "Comedy", "Laughs Guaranteed", 95, 50);
        DigitalVideoDisc newDvd4 = new DigitalVideoDisc("Sci-Fi Odyssey", "Sci-Fi", "Interstellar Adventure", 120, 60);
        DigitalVideoDisc newDvd5 = new DigitalVideoDisc("Documentary Discoveries", "Documentary", "Educational Insights", 100, 55);

        Book newBook1 = new Book(201, "Mystery Mansion", "Thriller", 15.99F);
        Book newBook2 = new Book(202, "Cooking Delights", "Cookbook", 20.99F);
        Book newBook3 = new Book(203, "Historical Odyssey", "History", 18.50F);

        Store newStore = new Store();
        newStore.addMedia(newCd);
        newStore.addMedia(newDvd1);



        StoreScreen newStoreScreen;
        newStoreScreen = new StoreScreen(newStore);
    }
}
