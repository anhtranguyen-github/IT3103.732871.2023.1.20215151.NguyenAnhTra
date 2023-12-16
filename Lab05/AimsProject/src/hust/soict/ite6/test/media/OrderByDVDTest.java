package hust.soict.ite6.test.media;

import hust.soict.ite6.aims.media.*;


public class OrderByDVDTest {
    public static void main(String[] args) {
        // Create some DigitalVideoDisc instances
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 14.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 24.99f);        // Set the ordering rule for comparison
        dvd1.setOrderBy(DigitalVideoDisc.OrderBy.TITLE);
        // Compare DVDs based on the specified rule
        int result = dvd1.compareTo(dvd2);
        // Check the result of the comparison
        if (result < 0) {
            System.out.println(dvd1.getTitle() + " comes before " + dvd2.getTitle());
        } else if (result > 0) {
            System.out.println(dvd1.getTitle() + " comes after " + dvd2.getTitle());
        } else {
            System.out.println(dvd1.getTitle() + " is equal to " + dvd2.getTitle());
        }
    }
}
