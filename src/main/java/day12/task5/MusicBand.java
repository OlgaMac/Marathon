package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public static void changeMembers (MusicBand a1, MusicBand a2){
        for(MusicArtist m: a1.getMembers()){
            a2.getMembers().add(m);
        }

        a1.getMembers().clear();
    }

    public  void printMembers(){
        System.out.println(this.members);
    }

    @Override
    public String toString() {
        return getName() + " " + getYear();
    }
}
