package day16;

import day15.Goods;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        PrintWriter pw = new PrintWriter(file1);
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            pw.println(random.nextInt(100));
        }
        pw.close();

        Scanner scanner = new Scanner(file1);
        PrintWriter pw2 = new PrintWriter(file2);
        int count = 0;
        int sum = 0;
        while(scanner.hasNextLine()){
            sum += Integer.parseInt(scanner.nextLine());
            count ++;
            if(count == 20){
                pw2.println(sum / 20.0);

                count = 0;
                sum = 0;
            }
        }
        pw2.close();

        Scanner scanner2 = new Scanner(file2);
        double sumGeneral = 0;

        while( scanner2.hasNextLine()){
            sumGeneral += Double.parseDouble(scanner2.nextLine());
        }
        System.out.println((int)sumGeneral);
    }
}

