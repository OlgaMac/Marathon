package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int count = 0;
        int count1 = 0;
        int counter = 0;
        int plus = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        for (Integer s : arr) {
            plus = plus + s;
        }
        System.out.print(Arrays.toString(arr));
        System.out.println("\nСумма всех элементов массива: " + plus);
        System.out.println("\nДлина массива: " + arr.length);
        for (Integer c : arr) {
            if (c > 8) {
                count++;
            }
        }
        System.out.println("Количество чисел больше 8: " + count);
        for (Integer c : arr) {
            if (c == 1) {
                count++;
            }
        }
        System.out.println("Количество чисел равных 1: " + count);
        for (Integer c : arr) {
            if (c % 2 == 0) {
                count1++;
            } else {
                counter++;
            }
        }
        System.out.println("Количество четных чисел: " + count1);
        System.out.println("Количество нечетных чисел: " + counter);
            //System.out.println("Количество четных чисел: " + count);
            //for (Integer c : arr) {
            //    if (c % 2 != 0) {
            //       count++;
            //   }
            //}
            //System.out.println("Количество нечетных чисел: " + count);
        }
    }





