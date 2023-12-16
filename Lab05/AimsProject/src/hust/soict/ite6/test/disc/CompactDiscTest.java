package hust.soict.ite6.test.disc;

import hust.soict.ite6.aims.media.CompactDisc;
import hust.soict.ite6.aims.media.Track;

public class CompactDiscTest {
    public static void main(String[] args) {
        // Create a CompactDisc object
        CompactDisc cd = new CompactDisc("Album Title", "Music", "Artist Name", 120, 19.99f);
        // Create some Track objects
        Track track1 = new Track("Track 1", 30);
        Track track2 = new Track("Track 2", 25);
        Track track3 = new Track("Track 3", 35);
        // Add tracks to the CompactDisc
        cd.addTrack(track1);
        cd.addTrack(track2);
        cd.addTrack(track3);
        // Display information about the CompactDisc
        System.out.println("CompactDisc Information:");
        System.out.println("Title: " + cd.getTitle());
        System.out.println("Category: " + cd.getCategory());
        System.out.println("Artist: " + cd.getDirector());
        System.out.println("Total Length: " + cd.getLength() + " minutes");
        System.out.println("Cost: $" + cd.getCost());
        // Display information about each track
        System.out.println("\nTrack List:");
        for (Track track : cd.getTracks()) {
            System.out.println("Track: " + track.getTitle() + ", Length: " + track.getLength() + " minutes");
        }
        // Remove a track and display the updated track list
        cd.removeTrack(track2);
        System.out.println("\nUpdated Track List:");
        for (Track track : cd.getTracks()) {
            System.out.println("Track: " + track.getTitle() + ", Length: " + track.getLength() + " minutes");
        }
    }
}
