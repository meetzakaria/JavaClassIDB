package Class18;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int x = input.nextInt();

        if (x <= 1) {
            System.out.println(x + " is not a prime number.");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(x + " is a prime number.");
            } else {
                System.out.println(x + " is not a prime number.");
            }
        }

        input.close();
    }
}
