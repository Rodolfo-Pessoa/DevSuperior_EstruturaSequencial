import entities.Terreno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Terreno terreno = new Terreno();

        System.out.print("Enter the width of the land: ");
        terreno.setWidth(sc.nextDouble());
        System.out.print("Enter the length of the land: ");
        terreno.setLength(sc.nextDouble());
        System.out.print("Enter the price per square meter: ");
        terreno.setSquareMeter(sc.nextDouble());

        System.out.printf("Area: %.2f%n", terreno.area(terreno.getWidth(), terreno.getWidth()));

        terreno.landPrice();

        sc.close();
    }
}