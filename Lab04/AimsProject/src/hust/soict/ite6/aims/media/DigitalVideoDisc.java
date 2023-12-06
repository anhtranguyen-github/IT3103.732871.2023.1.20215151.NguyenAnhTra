// Nguyen Anh Tra - 20215151

package hust.soict.ite6.aims.media;

public class DigitalVideoDisc extends Media{
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
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
        this.setCategory(category);
        this.director = director;
        this.cost = cost;
        init();
    }


}
