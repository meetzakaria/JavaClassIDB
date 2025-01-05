package Class19;

import java.util.Scanner;

public class Fibonacci {

    public static void fibonacci(int n) {
        long first = 0, second = 1, next;

        System.out.print("Fibonacci Series: " + first + " " + second);

        for (int i = 3; i <= n; i++) {
            next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many Fibonacci numbers would you like to see? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a number greater than 0.");
        } else {
            fibonacci(n);
        }

        sc.close();
    }
}
