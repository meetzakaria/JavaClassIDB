package Class_05_12_2024;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        
        int initGCD = 1;
        int letGCD = 2;
        while (letGCD <= num1 && letGCD <= num2) {
            if (num1 % letGCD == 0 && num2 % letGCD == 0) {
                initGCD = letGCD;
            }
            letGCD++;
        }
        System.out.println("Greatest common divisor for " + num1 + " and " + num2 + " is: " + initGCD);
    }
}
