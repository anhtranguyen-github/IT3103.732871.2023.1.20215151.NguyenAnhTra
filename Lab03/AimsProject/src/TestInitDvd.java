import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestInitDvd {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
                "Roger Allers", 87, 19.95f);
        System.out.println("Total num: " + DigitalVideoDisc.getQtyDvd());        ;
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", "Science Fiction",
                "George Lucas", 87, 24.95f);
        System.out.println("Total num: " + DigitalVideoDisc.getQtyDvd());
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation",
                18.99f);
        System.out.println("Total num: " + DigitalVideoDisc.getQtyDvd());
    }
}
