package Practic.Day12.Ex5;

public class MusicArtist {
    private String name;
    private int years;

    public MusicArtist(String name, int years){
        this.name = name;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }

    @Override
    public String toString() {
        return "Имя участника: "+getName()+", возраст: "+getYears();
    }
}
