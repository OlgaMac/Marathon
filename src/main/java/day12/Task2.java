package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0, j = 300; i < 30 && j < 350; i++, j++) {
            if (i % 2 == 0) {
                list.add(i);
            }
            if (j % 2 != 0) {
                list.add(j);
            }
        }
        System.out.println(list);
    }
}
