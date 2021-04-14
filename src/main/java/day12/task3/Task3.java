package day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> groups = new ArrayList<>();

        groups.add(new MusicBand("Ruki Verh", 1993));
        groups.add(new MusicBand("Skorpions", 1965));
        groups.add(new MusicBand("Pilot", 1997));
        groups.add(new MusicBand("Fabrika", 2002));
        groups.add(new MusicBand("Kino", 1982));
        groups.add(new MusicBand("Kipelov", 2002));
        groups.add(new MusicBand("Pussycat Dolls", 2003));
        groups.add(new MusicBand("Beats Antique", 2005));
        groups.add(new MusicBand("IOWA", 2009));
        groups.add(new MusicBand("Flying Colors", 2012));
        groups.add(new MusicBand("The Carters", 2018));


        System.out.println(groups);
        Collections.shuffle(groups);
        System.out.println(groups);

        List<MusicBand> bands = getMusicBands(groups);
        System.out.println(bands);
    }

    private static List<MusicBand> getMusicBands(List<MusicBand> groups) {
        List<MusicBand> bands = new ArrayList<>();
        for (MusicBand s : groups) {
            if (s.getYear() > 2000) {
                bands.add(s);
            }
        }
        return bands;
    }
}
