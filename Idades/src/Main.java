import entities.PersonalData;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        PersonalData personalData1 = new PersonalData();

        System.out.println("First person data:");
        System.out.print("Name: ");
        personalData1.setName(sc.nextLine());
        System.out.print("Age: ");
        personalData1.setAge(sc.nextInt());
        sc.nextLine();

        PersonalData personalData2 = new PersonalData();

        System.out.println("Second person data");
        System.out.print("Name: ");
        personalData2.setName(sc.nextLine());
        System.out.print("Age: ");
        personalData2.setAge(sc.nextInt());

        System.out.println("The average age of "
                            + personalData1.getName() +
                            " and "
                            + personalData2.getName() +
                            " is "
                            + (personalData1.getAge() + personalData2.getAge()) /2
                            + " years old.");

        sc.close();
    }
}