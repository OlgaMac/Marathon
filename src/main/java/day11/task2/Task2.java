package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physikalAttack(paladin);
        System.out.println(paladin);

        paladin.physikalAttack(magician);
        System.out.println(magician);

        shaman.healTeam(magician);
        System.out.println(magician);

        magician.magikalAttack(paladin);
        System.out.println(paladin);

        shaman.physikalAttack(warrior);
        System.out.println(warrior);

        paladin.healHimself();
        System.out.println(paladin);

        for (int i = 0; i < 5; i++) {
            warrior.physikalAttack(magician);
            System.out.println(magician);
        }
    }
}
