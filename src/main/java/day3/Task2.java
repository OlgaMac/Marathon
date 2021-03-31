package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y, a;
        while (true) {
            x = scanner.nextDouble();
            y = scanner.nextDouble();

            if (y == 0) {
                break;
            }
            a = x / y;
            System.out.println(a);
        }
    }
}

