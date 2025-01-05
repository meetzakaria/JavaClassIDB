package Class3;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner primeEnter = new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int prime = primeEnter.nextInt();
        if (Prime(prime)) {
            System.out.println(prime + " is a prime number.");
        } else {
            System.out.println(prime + " is not a prime number.");
        }
        primeEnter.close();
    }

    public static boolean Prime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
