package entities;

public class Rectangle {
    private double height;
    private double base;

    public Rectangle() {
    }

    public double area(double base, double height) {
        return base * height;
    }

    public double perimeter(double base, double height) {
        return 2 * (base + height);
    }

    public double diagonal(double base, double height) {
        return Math.sqrt((base * base) + (height * height));
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
