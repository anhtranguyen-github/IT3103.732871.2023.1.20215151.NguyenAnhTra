package hust.soict.ite6.test.media;


import hust.soict.ite6.aims.media.Track;

public class TrackTest {
    public static void main(String[] args) {

        // Test for Track class
        Track track1 = new Track("Song Title", 180);
        Track track2 = new Track("Song Title", 180);
        String sth1 = "Song Title";
        int sth2 = 54;
        Song song = new Song("Song Title", 180);

        System.out.println("\nTest for Track class:");
        System.out.println("track1.equals(track2): " + track1.equals(track2)); // Should print true
        System.out.println("track1.equals(\"Song Title\"): " + track1.equals(sth1)); // Should print false
        System.out.println("track1.equals(54): " + track1.equals(sth2)); // Should print false
        System.out.println("track1.equals(song): " + track1.equals(song));// Should print false

    }
    private static class Song {
        private String title;
        private int length;

        public Song(String title, int length) {
            this.title = title;
            this.length = length;
        }
    }
}