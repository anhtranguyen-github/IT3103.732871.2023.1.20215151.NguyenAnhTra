package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Create a hust.soict.dsai.aims.store.Store
        Store store = new Store();

        // Create some DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Movie 1", "Category 1", "Director 1", 120, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Movie 2", "Category 2", "Director 2", 90, 14.99f);

        // Test addDVD method
        store.addDVD(dvd1);
        store.addDVD(dvd2);

        // Test removeDVD method
        store.removeDVD(dvd1);

        // Display the remaining DVDs in the store
        System.out.println("Remaining DVDs in the store:");
        for (int i = 0; i < store.getItemCount(); i++) {
            System.out.println(store.getItemsInStore()[i].toString());
        }
    }
}
