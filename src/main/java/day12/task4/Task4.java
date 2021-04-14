package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Ivan Petrov");
        members1.add("Alla Perova");
        members1.add("Martin Ernst");
        members1.add("Klara Ben");

        MusicBand kolokolchik = new MusicBand("Kolokolchik", 2020, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Patrik Wels");
        members2.add("Veronika Klass");
        members2.add("Fabian Klav");
        members2.add("Nastya Meen");

        MusicBand brod = new MusicBand("Brod", 2005, members2);

        kolokolchik.printMembers();
        brod.printMembers();

        MusicBand.changeMembers(kolokolchik, brod);
        kolokolchik.printMembers();
        brod.printMembers();
    }
}
