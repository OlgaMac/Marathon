package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player one = new Player(random.nextInt(10) + 90);
        Player two = new Player(random.nextInt(10) + 90);
        Player three = new Player(random.nextInt(10) + 90);
        Player.info();
        Player fore = new Player(random.nextInt(10) + 90);
        Player five = new Player(random.nextInt(10) + 90);
        Player six = new Player(random.nextInt(10) + 90);
        Player.info();
        //Player seven = new Player(random.nextInt(10) + 90);
        //Player.info();
        //Player eight = new Player(random.nextInt(10) + 90);
        //Player.info();
        for(int i = 0; i< 100; i++){
            two.run();
        }
        Player.info();
        for(int i = 0; i< 100; i++){
            six.run();
        }
        Player.info();
    }
}
