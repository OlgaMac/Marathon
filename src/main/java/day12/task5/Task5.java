package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Ivan Petrov",25));
        members1.add(new MusicArtist("Alla Perova", 35));
        members1.add(new MusicArtist("Martin Ernst",20));
        members1.add(new MusicArtist("Klara Ben",30));

        day12.task5.MusicBand kolokolchik = new day12.task5.MusicBand("Kolokolchik", 2001, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Patrik Wels", 18));
        members2.add(new MusicArtist("Veronika Klass", 24));
        members2.add(new MusicArtist("Fabian Klav",40));
        members2.add(new MusicArtist("Nastya Meen", 35));

        day12.task5.MusicBand brod = new day12.task5.MusicBand("Brod", 2005, members2);


        kolokolchik.printMembers();
        brod.printMembers();

        MusicBand.changeMembers(kolokolchik, brod);
        kolokolchik.printMembers();
        brod.printMembers();
    }
}
