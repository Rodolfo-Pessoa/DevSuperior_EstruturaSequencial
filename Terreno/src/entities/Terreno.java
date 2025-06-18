package entities;

public class Terreno {
    private double width;
    private double length;
    private double squareMeter;

    public Terreno() {
    }

    public double area(double width, double length) {
        return width * length;
    }

    public void landPrice() {
        System.out.printf("Land price: $ %.2f", this.length * this.width * squareMeter);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setSquareMeter(double squareMeter) {
        this.squareMeter = squareMeter;
    }
}

