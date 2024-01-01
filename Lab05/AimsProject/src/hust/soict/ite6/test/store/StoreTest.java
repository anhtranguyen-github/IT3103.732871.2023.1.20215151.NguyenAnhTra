// Nguyen Anh Tra - 20215151
package hust.soict.ite6.test.store;
import hust.soict.ite6.aims.store.Store;
import hust.soict.ite6.aims.media.Book;
import hust.soict.ite6.aims.media.CompactDisc;
import hust.soict.ite6.aims.media.Media;
import hust.soict.ite6.aims.media.Track;

public class StoreTest {

    public static void main(String[] args) {
        // Create a store
        Store store = new Store();

        // Create some media items
        Media book1 = new Book(1, "Book 1", "Category 1", 10.0f);
        Media book2 = new Book(2, "Book 2", "Category 2", 15.0f);
        Media cd1 = new CompactDisc(3, "CD 1", "Category 3", 20.0f);
        Track track1 = new Track("Track 1", 5);
        Track track2 = new Track("Track 2", 7);
        ((CompactDisc) cd1).addTrack(track1);
        ((CompactDisc) cd1).addTrack(track2);
        // Test adding media to the store
        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(cd1);
        // Test retrieving information about the items in the store
        System.out.println("Number of items in the store: " + store.getItemCount());
        Media[] itemsInStore = store.getItemsInStore().toArray(new Media[0]);
        System.out.println("Items in the store:");
        for (Media item : itemsInStore) {
            if (item == null) {
                break;
            }
            System.out.println(item.getTitle());
        }
        // Test removing media from the store
        store.removeMedia(book2);
        // Test retrieving updated information about the items in the store
        System.out.println("Number of items in the store after removal: " + store.getItemCount());
        itemsInStore = store.getItemsInStore().toArray(new Media[0]);
        System.out.println("Items in the store after removal:");
        for (Media item : itemsInStore) {
            if (item == null) {
                break;
            }
            System.out.println(item.getTitle());
        }
    }
}
