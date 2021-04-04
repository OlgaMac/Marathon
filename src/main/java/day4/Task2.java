package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random random = new Random();
        int sum = 0;
        //int max = numbers[0];
        //int min = numbers[0];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }
        for (Integer s : numbers) {
            System.out.print(s + " ");
        }
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] > max) {
                max = numbers[j];
                index = j;
            }
            if (numbers[j] < min) {
                min = numbers[j];
                index = j;
            }

        }
        System.out.println("\n" + max);
        System.out.println("\n" + min);
        for (Integer s : numbers) {
            if (s % 10 == 0) {
                count++;
                sum = sum + s;
            }
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
