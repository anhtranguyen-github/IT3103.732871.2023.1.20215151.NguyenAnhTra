package hust.soict.ite6.aims.store;

import hust.soict.ite6.aims.disc.DigitalVideoDisc;

public class Store {
    private static final int MAX_ITEMS_IN_STORE = 50;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS_IN_STORE];
    private int itemCount = 0;

    // Other methods and constructors as needed

    public int getItemCount() {
        return itemCount;
    }

    public DigitalVideoDisc[] getItemsInStore() {
        return itemsInStore;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (itemCount < MAX_ITEMS_IN_STORE) {
            itemsInStore[itemCount] = dvd;
            itemCount++;
            System.out.println("DVD added to the store.");
        } else {
            System.out.println("The store is full. Cannot add more DVDs.");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < itemCount; i++) {
            if (itemsInStore[i] == dvd) {
                for (int j = i; j < itemCount - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[itemCount - 1] = null;
                itemCount--;
                System.out.println("DVD removed from the store.");
                return;
            }
        }
        System.out.println("The DVD is not in the store.");
    }
}

