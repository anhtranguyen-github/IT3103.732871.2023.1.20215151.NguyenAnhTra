// Nguyen Anh Tra - 20215151

package hust.soict.ite6.test.disc;

import hust.soict.ite6.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        //swap(jungleDVD, cinderellaDVD);
        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("Cinderella dvd title: " + cinderellaDVD.getTitle());

        DigitalVideoDisc[] dvdArray = {jungleDVD, cinderellaDVD};
        newSwap(dvdArray);
        System.out.println("After newSwap:");
        System.out.println("DVD at position 0 title: " + dvdArray[0].getTitle());
        System.out.println("DVD at position 1 title: " + dvdArray[1].getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
    public static void newSwap(DigitalVideoDisc[] dvdArray) {
        DigitalVideoDisc tmp = dvdArray[0];
        dvdArray[0] = dvdArray[1];
        dvdArray[1] = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}