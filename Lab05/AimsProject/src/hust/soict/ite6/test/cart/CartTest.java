// Nguyen Anh Tra - 20215151

package hust.soict.ite6.test.cart;
import hust.soict.ite6.aims.media.Book;
import hust.soict.ite6.aims.media.CompactDisc;
import hust.soict.ite6.aims.media.Media;
import hust.soict.ite6.aims.media.Track;
import hust.soict.ite6.aims.cart.Cart;

public class CartTest {

    public static void main(String[] args) {
        // Create a cart
        Cart cart = new Cart();

        // Create some media items
        Media book1 = new Book(1, "Book 1", "Category 1", 10.0f);
        Media book2 = new Book(2, "Book 2", "Category 2", 15.0f);
        Media cd1 = new CompactDisc(3, "CD 1", "Category 3", 20.0f);
        Track track1 = new Track("Track 1", 5);
        Track track2 = new Track("Track 2", 7);
        ((CompactDisc) cd1).addTrack(track1);
        ((CompactDisc) cd1).addTrack(track2);
        // Test adding media to the cart
        cart.addMedia(book1);
        cart.addMedia(book2);
        cart.addMedia(cd1);
        // Test displaying the cart
        cart.displayCart();
        // Test removing media from the cart
        cart.removeMedia(book2);
        // Test searching media by ID and Title
        cart.searchById(1);
        cart.searchByTitle("CD 1");
        // Test adding an array of media to the cart
        Media[] additionalMedia = {
                new Book(4, "Book 3", "Category 4", 12.0f),
                new CompactDisc(5, "CD 2", "Category 5", 25.0f)
        };
        cart.addMedia(additionalMedia);
        // Test displaying the cart after adding more media
        cart.displayCart();
    }
}
