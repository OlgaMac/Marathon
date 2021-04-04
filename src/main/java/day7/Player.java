package day7;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int count;

    public Player(int stamina) {
        this.stamina = stamina;
        if (count < 6) {
            count++;
        }
    }


    public int getStamina() {
        return stamina;
    }

    public static int getCount() {
        return count;
    }

    public void run() {
        if (stamina == 0)
            return;
        stamina--;
        if (stamina == 0)
            count--;
    }

    public static void info() {
        if (count < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - count) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
