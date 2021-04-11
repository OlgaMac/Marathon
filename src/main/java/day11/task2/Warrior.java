package day11.task2;

public class Warrior extends Hero {
    public Warrior() {
        physAttack = 30;
        physDef = 0.8;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
