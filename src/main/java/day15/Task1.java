package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File warehouse= new File("writeFile.txt");
        //readFile();
        try{
            PrintWriter pw = new PrintWriter(warehouse);
            pw.println(readFile());
            System.out.println(pw);
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Информация для записи не найдена");
        }

    }

    private static List<Goods> readFile() {
        File ware = new File("src/main/resources/shoes.csv");
        List<Goods> wares = new ArrayList<>();
        int sum = 0;
        try {
            Scanner scanner = new Scanner(ware);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line == null) {
                    break;
                }
                String[] cells = line.split(";");
                Goods good = new Goods(cells[0], Integer.parseInt(cells[1]), Integer.parseInt(cells[2]));
                if (Integer.parseInt(cells[2]) == 0) {
                    wares.add(good);
                }
            }
            scanner.close();
            return wares;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return null;
    }
}
