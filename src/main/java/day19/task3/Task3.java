package day19.task3;

import day15.Goods;
import day19.StatWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/taxi_cars.txt"));
        HashMap<Integer, Point> cars = new HashMap<>();
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            String[] cells = line.split(" ");
            int key = Integer.parseInt(cells[0]);
            Point position = new Point(Integer.parseInt(cells[1]), Integer.parseInt(cells[2]));
            cars.put(key, position);
        }
        reader.close();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение первой координаты");
        System.out.println("x1 = ");
        int x1 = scanner.nextInt();
        System.out.println("y1 = ");
        int y1 = scanner.nextInt();
        System.out.println("Введите значение второй координаты");
        System.out.println("x2 = ");
        int x2 = scanner.nextInt();
        System.out.println("y2 = ");
        int y2 = scanner.nextInt();

        /*List<Point> point = new ArrayList<>();
        for (int i = x1, j = y1; i <= x2 && j <= y2; i++, j++){
            point.add(new Point(i, j));
        }
        System.out.println(point);*/


        for (Map.Entry<Integer, Point> entry : cars.entrySet()) {
            for (int i = x1, j = y1; i <= x2 && j <= y2; i++, j++) {
                Point point = new Point(i, j);
                if (entry.getValue().equals(point)) {
                    System.out.println(entry);
                }
            }

            for (int i = x1, j = y1; i >= x2 && j >= y2; i--, j--) {
                Point point = new Point(i, j);
                if (entry.getValue().equals(point)) {
                    System.out.println(entry);
                }
            }
            for (int i = x1, j = y1; i <= x2 && j >= y2; i++, j--) {
                Point point = new Point(i, j);
                if (entry.getValue().equals(point)) {
                    System.out.println(entry);
                }
            }
            for (int i = x1, j = y1; i >= x2 && j <= y2; i--, j++) {
                Point point = new Point(i, j);
                if (entry.getValue().equals(point)) {
                    System.out.println(entry);
                }
            }
        }
    }
}

