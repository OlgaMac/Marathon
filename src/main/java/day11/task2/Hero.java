package day11.task2;

public abstract class Hero implements physAttack {
    static final int MAX_HEALTH = 100;
    final int MIN_HEALTH = 0;
    int health;
    int physAttack;
    double physDef;
    double magicDef;

    public Hero() {
        this.health = 100;
    }

    @Override
    public void physikalAttack(Hero h) {
        double attack = physAttack * (1 - h.physDef);
        if (h.health - attack < MIN_HEALTH) {
            h.health = MIN_HEALTH;
        } else {
            h.health -= attack;
        }
    }
}
