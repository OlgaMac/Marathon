package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File ware = new File("src/main/resources/numbers19.txt");
        HashSet<Long> numbers = new HashSet<>();
        int sum = 0;
        try {
            Scanner scanner = new Scanner(ware);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line == null) {
                    break;
                }
                long num = Long.parseLong(line);
                numbers.add(num);
            }
            scanner.close();
            int count = 0;

            for (long i = 500000000; i <= 600000000; i++) {
                if (numbers.contains(i)) {
                    count++;
                }
            }
            System.out.println(count);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
