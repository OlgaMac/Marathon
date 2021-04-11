package day11.task2;

public class Paladin extends Hero implements Healer {

    static final int HEALTH_AMOUNT = 25;
    static final int HEALTH_TEAM_AMOUNT = 10;

    public Paladin() {
        physAttack = 15;
        physDef = 0.5;
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
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}

