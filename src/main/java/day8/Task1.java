package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int size = 20001;
        for (int i = 1; i < size; i++) {
            sb.append(i + " ");
        }
        System.out.print(sb);
    }
}
