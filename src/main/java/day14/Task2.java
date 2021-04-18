package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        parseFileToStringList();
    }

    public static List<People> parseFileToStringList() {
        File file = new File("people.txt");
        List<People> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line == null) {
                    break;
                }
                String[] cells = line.split(" ");
                if(Integer.parseInt(cells[1]) < 0) {
                    throw new IllegalAccessException();
                }

                People p = new People(cells[0],Integer.parseInt(cells[1]));
                people.add(p);
            }
            System.out.println(people);
            scanner.close();
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalAccessException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
