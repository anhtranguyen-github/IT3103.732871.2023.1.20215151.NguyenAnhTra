// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Test {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
                "Roger Allers", 87, 19.95f);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", "Science Fiction",
                "George Lucas", 87, 24.95f);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation",
                18.99f);

        DigitalVideoDisc[] dvdList = new DigitalVideoDisc[]{dvd1, dvd2, dvd3};
        anOrder.addDigitalVideoDisc(dvdList);
        System.out.println("Total Cost is: " + anOrder.totalCost());
    }
}