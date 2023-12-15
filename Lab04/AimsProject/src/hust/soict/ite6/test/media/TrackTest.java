package hust.soict.ite6.test.media;


import hust.soict.ite6.aims.media.Track;

public class TrackTest {
    public static void main(String[] args) {

        // Test for Track class
        Track track1 = new Track("Song Title", 180);
        Track track2 = new Track("Song Title", 180);
        Track track3 = new Track("Different Song", 200);

        System.out.println("\nTest for Track class:");
        System.out.println("track1.equals(track2): " + track1.equals(track2)); // Should print true
        System.out.println("track1.equals(track3): " + track1.equals(track3)); // Should print false
    }
}