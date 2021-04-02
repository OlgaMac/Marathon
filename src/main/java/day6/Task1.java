package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car(1999, "White", "Volkswagen");
        car.info();
        int yearOfcar = car.yearDifference(2020);
        System.out.println("Year Difference = " + yearOfcar);
        Bike bike = new Bike(2020, "Green", "Honda");
        bike.info();
        int yearOfBike = bike.yearDifference(2010);
        System.out.println("Year Difference = " + yearOfBike);

    }
}
