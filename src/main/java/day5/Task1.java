package day5;

public class Task1 {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setYear(1989);
        bmw.setColor("Black");
        bmw.setModel("BMW");
        System.out.println("Year of car manufacture: " + bmw.getYear() +
                "\nColor of car: " + bmw.getColor() +
                "\nModel of car " + bmw.getModel());

    }
}

class Car {
    private int year;
    private String color;
    private String model;

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }
}