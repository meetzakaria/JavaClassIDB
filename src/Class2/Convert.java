package Class2;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        double cel = in.nextDouble();

        double celsius = (cel * 9 / 5) + 32;
        System.out.println("Celsius "+cel + " To " + celsius+" Fahrenheit");


        System.out.print("Enter Fahrenheit: ");
        double fah = in.nextDouble();

        double fahrenheit = (5.0 / 9) * (fah -32);
        System.out.println("Fahrenheit "+fah + " To " + fahrenheit + " Celsius");

    }

}
