package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File num = new File("file.txt");
        printSumDigits(num);
    }

    private static void printSumDigits(File num) {
        int sum = 0;
        try {
            Scanner scanner = new Scanner(num);

            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            for (String number : numbersString)
                sum += Integer.parseInt(number);

            System.out.println(sum);
            if (numbersString.length != 10) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Некорректный входной файл");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
