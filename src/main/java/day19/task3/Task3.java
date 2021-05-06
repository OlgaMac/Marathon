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
        Map<Integer, Point> cars = new HashMap<>();
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

        int[] points = {x1, y1, x2, y2};

        for (Map.Entry<Integer, Point> entry : cars.entrySet()) {
            if(isInside(entry, points) == true){
                System.out.println(entry);
            }
        }
    }

    private static boolean isInside(Map.Entry<Integer, Point> taxiCar, int[] square) {
        int taxiX = taxiCar.getValue().getX();
        int taxiY = taxiCar.getValue().getY();

        return (taxiX > square[0] && taxiX < square[2]|| taxiX < square[0] && taxiX > square[2])&&
                (taxiY < square[1] && taxiY > square[3]||taxiY > square[1] && taxiY < square[3]);
    }
}



