package day6;

class Car {
    private int year;
    private String color;
    private String model;

    public Car(int year, String color, String model) {
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

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void info(){
        this.model = model;
        this.color = color;
        this.year = year;
        System.out.println("Year of car manufacture: " + year +
                "\nColor of car: " + color +
                "\nModel of car " + model);
    }
    public int yearDifference(int inputYear){
        this.year = Math.abs(inputYear - year);
        return year;
    }
}