package day19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Task1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("dushi1.txt"));
        HashMap<String, StatWords> frequncyTable = new HashMap<>();
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            String[] words = line.toLowerCase().split("(?U)[^\\p{Lower}]+");
            for (String word : words) {

                if (word.length() > 0) {
                    if (frequncyTable.containsKey(word)) {
                        frequncyTable.get(word).incrementCount();
                    } else {
                        frequncyTable.put(word, new StatWords(word));
                    }
                }
            }

        }

        List<StatWords> stat = new ArrayList<>(frequncyTable.values());

        stat.sort((o1, o2) -> o2.getCount() - o1.getCount()); // Чичиков  - 608 раз
        for(StatWords sw: stat){
            System.out.println(sw.getWord() + " " + sw.getCount());
        }
    }
}
