package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random random = new Random();
        int sum = 0;
        int max1 = numbers[0];
        int max2 = numbers[0];
        int max3 = numbers[0];
        int count = 0;
        int index1 = -1;
        int index2 = -1;
        int index3 = -1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }
        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] > max1) {
                max1 = numbers[i];
                index1 = i;
            }
        }
        System.out.println("\nMax 1 = " + max1);
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max2 && i != index1)
            {
                max2 = numbers[i];
                index2 = i;
            }
        }
        System.out.println("\nMax 2 = " + max2);
        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] > max3 && i != index1&& i != index2)
            {
                max3 = numbers[i];
                index3 = i;
            }
        }
        System.out.println("\nMax 3 = " + max3);
        System.out.println("\nIndex of maximal number= " + index1);
        System.out.println("\nSum = " + (max1 + max2 +max3));
    }

}
