package Practic.Day12.Ex5;

import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {

        List<MusicArtist> linkinParkMembers = new ArrayList<>();
        List<MusicArtist> outcastMembers = new ArrayList<>();

        MusicArtist rob = new MusicArtist("Rob Bourdon", 26);
        MusicArtist brad = new MusicArtist("Brad Delson", 32);
        MusicArtist andre = new MusicArtist("Andre 3000", 23);
        MusicArtist big = new MusicArtist("Big Boy", 25);

        linkinParkMembers.add(rob);
        linkinParkMembers.add(brad);

        outcastMembers.add(andre);
        outcastMembers.add(big);


        MusicBand linkinParkBand = new MusicBand("Linkin Park", 1996, linkinParkMembers);
        MusicBand outcastBand = new MusicBand("Outcast", 1991, outcastMembers);

        System.out.println(linkinParkBand);
        System.out.println(outcastBand);

        MusicBand.transferMembers(linkinParkBand, outcastBand);

        System.out.println(linkinParkBand);
        System.out.println(outcastBand);

    }
}
