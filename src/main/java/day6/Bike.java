package day6;


public class Bike{
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

    public void info(){
        this.model = model;
        this.color = color;
        this.year = year;
        System.out.println("Year of bike manufacture: " + year +
                "\nColor of bike: " + color +
                "\nModel of bike " + model);

    }
    public int yearDifference(int inputYear){
        this.year = Math.abs(inputYear - year);
        return year;
    }
}