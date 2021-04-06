package day9.Task2;

public class Circle extends Figure {
    private int r;

    public Circle(int r, String color) {
        super(color);
        this.r = r;
    }

    public int getR() {
        return r;
    }

    @Override
    public double area() {
        double area = r * r;
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 2 * Math.PI * r;
        return perimeter;
    }
}
