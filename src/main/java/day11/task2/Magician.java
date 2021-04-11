package day11.task2;

public class Magician extends Hero implements magikAttack {

    int magikAttack = 20;

    public Magician() {
        physAttack = 5;
        physDef = 0;
        magicDef = 0.8;
    }

    @Override
    public void magikalAttack(Hero h) {
        double attack = magikAttack * (1 - h.magicDef);
        if (h.health - attack < MIN_HEALTH) {
            h.health = MIN_HEALTH;
        } else {
            h.health -= attack;
        }
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
