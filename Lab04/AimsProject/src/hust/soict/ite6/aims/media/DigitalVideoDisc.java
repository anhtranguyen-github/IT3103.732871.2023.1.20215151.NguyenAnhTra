// Nguyen Anh Tra - 20215151

package hust.soict.ite6.aims.media;

public class DigitalVideoDisc extends Media implements Playable, Comparable<DigitalVideoDisc>{
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    //init method for nbDigitalVideoDiscs
    private void init() {
        nbDigitalVideoDiscs++;
    }
    //get nbDigitalVideoDiscs
    public static int getQtyDvd(){
        return nbDigitalVideoDiscs;
    }
    //add DVD with full information
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        this.setDirector(director);
        this.length = length;
        this.cost = cost;
        init();
    }
    //add DVD with only title
    public DigitalVideoDisc(String title) {
        super();
        this.setTitle(title);
        init();
    }
    //add DVD with category, title and cost
    public DigitalVideoDisc(String category, String title, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.cost = cost;
        init();
    }
    //add DVD with director, category, title and cost
    public DigitalVideoDisc( String director, String category, String title,  float cost) {
        this.setTitle(title);
        this.setDirector(director);
        this.setCategory(category);
        this.director = director;
        this.cost = cost;
        init();
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    @Override
    public String toString() {
        return super.toString() + ", Director: " + this.getDirector() + ", Length: "+this.getLength();
    }

    // Enum to represent different ordering rules
    public enum OrderBy {TITLE, DECREASING_LENGTH, COST}
    private OrderBy orderBy = OrderBy.TITLE;
    public void setOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy;
    }
    @Override
    public int compareTo(DigitalVideoDisc other) {
        // Check the current ordering rule
        switch (orderBy) {
            case TITLE:
                return compareByTitle(other);
            case DECREASING_LENGTH:
                return compareByDecreasingLength(other);
            case COST:
                return compareByCost(other);
            default:
                return 0; // Default case, no comparison
        }
    }
    private int compareByTitle(DigitalVideoDisc other) {
        // Compare DVDs by title
        return this.getTitle().compareToIgnoreCase(other.getTitle());
    }
    private int compareByDecreasingLength(DigitalVideoDisc other) {
        // Compare DVDs by decreasing length
        return Integer.compare(other.getLength(), this.getLength());
    }
    private int compareByCost(DigitalVideoDisc other) {
        // Compare DVDs by cost
        return Float.compare(this.getCost(), other.getCost());
    }
}
