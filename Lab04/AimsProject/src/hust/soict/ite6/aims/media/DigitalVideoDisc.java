// Nguyen Anh Tra - 20215151

package hust.soict.ite6.aims.media;

public class DigitalVideoDisc extends Media implements Playable{
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
}
