public class DigitalVideoDisc {

    private final String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    //add DVD with full information
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    //add DVD with only title
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }
    //add DVD with category, title and cost
    public DigitalVideoDisc(String category, String title, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    //add DVD with director, category, title and cost
    public DigitalVideoDisc( String director, String category, String title,  float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
    @Override
    public String toString() {
        return String.format("DVD - %-20s - %-15s - %-20s - %-5d - %-5.2f$",
                title, category, director, length, cost);
    }

}
