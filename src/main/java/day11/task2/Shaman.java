package day11.task2;

public class Shaman extends Hero implements Healer, magikAttack {

    static final int HEALTH_AMOUNT = 50;
    static final int HEALTH_TEAM_AMOUNT = 30;
    int magikAttack = 15;
    public Shaman() {
        physAttack = 10;
        physDef = 0.2;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (health + HEALTH_AMOUNT > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += HEALTH_AMOUNT;
        }
    }

    @Override
    public void healTeam(Hero h) {
        if (h.health + HEALTH_TEAM_AMOUNT > MAX_HEALTH) {
            h.health = MAX_HEALTH;
        } else {
            h.health += HEALTH_TEAM_AMOUNT;
        }
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
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
