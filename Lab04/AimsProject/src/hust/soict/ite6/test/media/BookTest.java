package hust.soict.ite6.test.media;
import hust.soict.ite6.aims.media.Book;


public class BookTest {
    public static void main(String[] args) {
        // Create a new Book instance
        Book myBook = new Book(1, "The Great Gatsby", "Fiction", 29.99f);

        // Display book information
        displayBookInfo(myBook);

        // Add authors
        myBook.addAuthor("F. Scott Fitzgerald");
        myBook.addAuthor("F. Scott Fitzgerald");

        // Display book information after adding authors
        displayBookInfo(myBook);

    }
    // Helper method to display book information
    private static void displayBookInfo(Book book) {
        System.out.println("Book ID: " + book.getId());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Category: " + book.getCategory());
        System.out.println("Cost: $" + book.getCost());
        System.out.println("Authors: " + book.getAuthors());
        System.out.println("---------------");
    }
}