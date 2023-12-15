package hust.soict.ite6.aims.media;


import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc(int i, String s, String s1, float v) {
        super();
        this.setId(i);
        this.setTitle(s);
        this.setCategory(s1);
        this.setCost(v);
    }

    public CompactDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }
    public boolean addTrack(Track newTrack) {
        if(tracks.contains(newTrack)){
            return false;
        } else {
            tracks.add(newTrack);
            return true;
        }
    }
    public boolean removeTrack(Track track) {
        if(tracks.contains(track)){
            tracks.remove(track);
            return true;
        } else {
            return false;
        }
    }
    public int getLength(){
        int total = 0;
        for (Track i : tracks) {
            total += i.getLength();
        }
        return total;
    }
    public List<Track> getTracks() {
        return tracks;
    }
}
