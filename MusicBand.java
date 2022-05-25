package Practic.Day12.Ex5;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> groupMembers;


    public MusicBand(String name, int year, List<MusicArtist> members){
        this.name = name;
        this.year = year;
        this.groupMembers = members;
    }

    static void transferMembers(MusicBand a, MusicBand b){
        for(MusicArtist members : a.getGroupMembers())

            b.groupMembers.add(members);
            a.groupMembers.clear();
    }

    public List<MusicArtist> getGroupMembers(){
        return groupMembers;
    }

    public void printMembers(){
        System.out.println(getGroupMembers());
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Название группы: "+getName()+", год основания "+getYear()+", участники "+getGroupMembers();
    }
}
