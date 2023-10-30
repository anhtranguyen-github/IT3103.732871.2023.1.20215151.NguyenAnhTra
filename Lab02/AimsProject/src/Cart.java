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
}
