package hust.soict.ite6.aims.store;


import hust.soict.ite6.aims.media.Media;

public class Store {
    private static final int MAX_ITEMS_IN_STORE = 50;
    private Media[] itemsInStore = new Media[MAX_ITEMS_IN_STORE];
    private int itemCount = 0;

    // Other methods and constructors as needed

    public int getItemCount() {
        return itemCount;
    }

    public Media[] getItemsInStore() {
        return itemsInStore;
    }

    public void addMedia(Media m) {
        if (itemCount < MAX_ITEMS_IN_STORE) {
            itemsInStore[itemCount] = m;
            itemCount++;
            System.out.println("Product added to the store.");
        } else {
            System.out.println("The store is full. Cannot add more products.");
        }
    }

    public void removeMedia(Media m) {
        for (int i = 0; i < itemCount; i++) {
            if (itemsInStore[i] == m) {
                for (int j = i; j < itemCount - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[itemCount - 1] = null;
                itemCount--;
                System.out.println("Product removed from the store.");
                return;
            }
        }
        System.out.println("The product is not in the store.");
    }
}

