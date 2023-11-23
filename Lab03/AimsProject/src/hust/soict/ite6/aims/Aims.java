// Nguyen Anh Tra - 20215151

package hust.soict.ite6.aims;

import hust.soict.ite6.aims.cart.Cart;
import hust.soict.ite6.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        // Creating instances of DigitalVideoDisc
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Title 1", "Category 1", "Director 1", 120, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Title 2");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Category 3", "Title 3", 15.99f);

        // Print the number of DigitalVideoDisc instances
        System.out.println("Number of DVDs: " + DigitalVideoDisc.getQtyDvd());

        // Creating another instance
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Director 4", "Category 4", "Title 4", 24.99f);

        // Print the updated number of DigitalVideoDisc instances
        System.out.println("Number of DVDs: " + DigitalVideoDisc.getQtyDvd());
    }
}
