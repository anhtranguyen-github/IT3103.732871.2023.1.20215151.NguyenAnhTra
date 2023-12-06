// Nguyen Anh Tra - 20215151
package hust.soict.ite6.aims.cart;
import hust.soict.ite6.aims.media.DigitalVideoDisc;
import hust.soict.ite6.aims.media.Media;

public class Cart {
    private int qtyOrdered; //Quantity of items in cart
    public static final int MAX_NUMBERS_ORDERED = 20;
    private final Media[] itemsOrdered =
            new Media[MAX_NUMBERS_ORDERED];

    public void addDigitalVideoDisc(Media m){ // add a DVD to cart
        if (qtyOrdered < MAX_NUMBERS_ORDERED ){ // check quantity of cart
            itemsOrdered[qtyOrdered] = m;
            qtyOrdered++;
            // notification in console when add successfully
            System.out.println("The product has been added.");
        }
        else{
            //notification in console when cart is full
            System.out.println("The cart is almost full. Cannot add more products.");
        }
    }
    //remove DVD method
    public void removeMedia(Media m) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == m) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The product has been removed.");
                return;
            }
        }
        System.out.println("The disc is not in the cart.");
    }
    public float totalCost() { //total cost calc
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("****************************************CART*******************************************");
        System.out.println("Ordered Items:");

        int itemCount = 1;
        for (Media m : itemsOrdered) {
            if(m == null) break;
            System.out.printf("%d. %s\n",
                    itemCount++, m.toString());
        }

        double totalCost = totalCost(); // Assuming you have a method to calculate the total cost.
        System.out.printf("Total cost: %.2f $\n", totalCost);

        System.out.println("***************************************************************************************");
    }

    public void searchById(int id) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].hashCode() == id) {
                System.out.println("DVD found by ID:");
                System.out.println(itemsOrdered[i].toString());
                return;
            }
        }
        System.out.println("No match found for the given ID.");
    }


    public void searchByTitle(String title) {
        boolean found = false;
        System.out.println("Products found by title:");
        for (Media m : itemsOrdered) {
            if (m == null) break;
            if (m.isMatch(title)) {
                System.out.println(m.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No match found for the given title.");
        }
    }
    public void addMedia(Media[] media){
        for (Media m : media) {
            if (qtyOrdered <= MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered] = m;
                qtyOrdered++;
                System.out.println("The product " + m.getTitle() + " has been added");
            } else {
                System.out.println("Add the product " + m.getTitle() + "FAILED");
                return;
            }
        }
    }


}

