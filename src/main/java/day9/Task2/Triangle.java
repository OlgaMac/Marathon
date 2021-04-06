package day9.Task2;

public class Triangle extends Figure {
    private int length1;
    private int length2;
    private int length3;


    public Triangle(int length1, int length2, int length3, String color) {
        super(color);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    public int getLength1() {
        return length1;
    }

    public int getLength2() {
        return length2;
    }

    public int getLength3() {
        return length3;
    }

    @Override
    public double area() {
        double area = (length1 / 2) * (length2 + length3);
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = length1 + length2 + length3;
        return perimeter;
    }
}
