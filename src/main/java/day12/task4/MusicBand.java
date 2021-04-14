package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }


    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
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
        for(String m: a1.getMembers()){
            a2.getMembers().add(m);
        }
        //for(String m: a1.getMembers()){
         //   a1.getMembers().remove(m);
        //}
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
