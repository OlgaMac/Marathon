package day6;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        System.out.println("Изготовитель: " + producer +
                "\nгод выпуска: " + year +
                "\nдлина: (в метрах) " + length + "\nвес: (в тоннах) " + weight + "\nколичество топлива в баке: " + fuel);
    }
    public int fillUp(int n){
        this.fuel = fuel + n;
        return fuel;
    }
}
