package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrice = new int[12][8];
        int sum = 0;
        Random random = new Random();
        for(int i = 0; i < matrice.length; i++){
            for(int j = 0; j< matrice[i].length; j++){
                matrice[i][j] = random.nextInt(50);
                System.out.print(Arrays.deepToString(matrice));
            }
            System.out.println();
        }

        for(int i = 0; i < matrice.length; i++){
            for(int j = 0; j< matrice[i].length; j++){
                sum = sum + matrice[i][j];
            }
            System.out.println(sum + " ");
            sum = 0;
        }
    }
}
