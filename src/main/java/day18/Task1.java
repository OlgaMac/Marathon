package day18;

public class Task1 {
    public static void main(String[] args) {
        int i = 0;
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers, i)); // 65346
    }

    private static int recursionSum(int[] numbers, int i){
        if(i == numbers.length)
            return 0;
        return numbers[i] + recursionSum(numbers, i+1);
    }
}
