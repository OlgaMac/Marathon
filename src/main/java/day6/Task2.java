package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Auroflot", 1999, 60, 41);
        airplane.setYear(2001);
        airplane.setLength(70);
        airplane.fillUp(1085);
        airplane.fillUp(500);
        airplane.info();
    }
}
