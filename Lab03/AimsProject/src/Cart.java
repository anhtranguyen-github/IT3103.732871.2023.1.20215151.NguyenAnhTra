public class Cart {
    private int qtyOrdered; //Quantity of items in cart
    public static final int MAX_NUMBERS_ORDERED = 20;
    private final DigitalVideoDisc[] itemsOrdered =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public void addDigitalVideoDisc(DigitalVideoDisc disc){ // add a DVD to cart
        if (qtyOrdered < MAX_NUMBERS_ORDERED ){ // check quantity of cart
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            // notification in console when add successfully
            System.out.println("The disc has been added.");
        }
        else{
            //notification in console when cart is full
            System.out.println("The cart is almost full. Cannot add more discs.");
        }
    }
    //remove DVD method
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed.");
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
        System.out.println("************************************* Cart Display *************************************");
        System.out.println("Ordered Items:");

        int itemCount = 1;
        for (DigitalVideoDisc disc : itemsOrdered) {
            if(disc == null) break;
            System.out.printf("%d. %s\n",
                    itemCount++, disc.toString());
        }

        double totalCost = totalCost(); // Assuming you have a method to calculate the total cost.
        System.out.printf("Total cost: %.2f $\n", totalCost);

        System.out.println("****************************************************************************************");
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
        System.out.println("DVDs found by title:");
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc == null) break;
            if (disc.isMatch(title)) {
                System.out.println(disc.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No match found for the given title.");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for (DigitalVideoDisc digitalVideoDisc : dvdList) {
            if (qtyOrdered <= MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered] = digitalVideoDisc;
                qtyOrdered++;
                System.out.println("The disc " + digitalVideoDisc.getTitle() + " has been added");
            } else {
                System.out.println("Add the díc " + digitalVideoDisc.getTitle() + "FAILED");
                return;
            }
        }
    }

}

