package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("Aeroflot", 1999, 58, 40);
        Airplane a2 = new Airplane("Luftgansa", 1986, 63, 60);
        Airplane.compareAirplanes(a1,a2);
    }
}
