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

                People p = new People();
                p.name = cells[0];
                p.age = Integer.parseInt(cells[1]);
                if(p.age < 0){
                    throw new IllegalAccessException();
                }
                people.add(p);
            }
            System.out.println(people);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalAccessException e) {
            System.out.println("Некорректный входной файл");
        }
        return people;
    }

    public static class People {
        String name;
        int age;

        @Override
        public String toString() {
            return name + " " + age;
        }
    }
}
