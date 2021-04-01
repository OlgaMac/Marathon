package day5;


public class Task2 {
    public static void main(String[] args) {
        Bike bike = new Bike(2005, "Rot", "Suzuki");
        System.out.println("Year of bike manufacture: " + bike.getYear() +
                "\nColor of bike: " + bike.getColor() +
                "\nModel of bike " + bike.getModel());

    }
}
class Bike{
    private int year;
    private String color;
    private String model;

    public Bike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}