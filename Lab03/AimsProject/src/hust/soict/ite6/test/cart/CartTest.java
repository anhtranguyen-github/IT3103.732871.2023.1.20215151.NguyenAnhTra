// Nguyen Anh Tra - 20215151

package hust.soict.ite6.test.cart;

import hust.soict.ite6.aims.cart.Cart;
import hust.soict.ite6.aims.disc.DigitalVideoDisc;


public class CartTest {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
                "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", "Science Fiction",
                "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation",
                18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        anOrder.searchById(1);

        anOrder.searchByTitle("Start Wars");
        anOrder.searchByTitle("The Matrix");
    }
}