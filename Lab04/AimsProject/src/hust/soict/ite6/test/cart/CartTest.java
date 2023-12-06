// Nguyen Anh Tra - 20215151

package hust.soict.ite6.test.cart;

import hust.soict.ite6.aims.cart.Cart;
import hust.soict.ite6.aims.media.DigitalVideoDisc;


public class CartTest {
    public static void main(String[] args) {
        // Create a Cart instance
        Cart myCart = new Cart();

        // Create some DigitalVideoDisc instances
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Movie 1", "Category 1", "Director 1", 120, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Movie 2", "Category 2", "Director 2", 90, 12.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Movie 3", "Category 3", "Director 3", 150, 24.99f);

        // Add DVDs to the cart
        myCart.addDigitalVideoDisc(dvd1);
        myCart.addDigitalVideoDisc(dvd2);
        myCart.addDigitalVideoDisc(dvd3);

        // Display the contents of the cart
        myCart.displayCart();
    }
}