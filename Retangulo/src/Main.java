import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.print("Base of the rectangle: ");
        rectangle.setBase(sc.nextDouble());
        System.out.print("Height of the rectangle: ");
        rectangle.setHeight(sc.nextDouble());

        System.out.printf("%.4f%n", rectangle.area(rectangle.getBase(), rectangle.getHeight()));
        System.out.printf("%.4f%n", rectangle.perimeter(rectangle.getBase(), rectangle.getHeight()));
        System.out.printf("%.4f%n", rectangle.diagonal(rectangle.getBase(), rectangle.getHeight()));
    }
}