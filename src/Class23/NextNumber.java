package Class23;

import java.util.Scanner;

public class NextNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int nextNumber = number + 1;
        System.out.println("The next number is: " + nextNumber);
        scanner.close();
    }
}
