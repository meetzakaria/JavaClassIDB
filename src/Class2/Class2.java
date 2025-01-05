package Class2;

import java.util.Scanner;
public class Class2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Name");
        String inputString = sc.nextLine();

        System.out.print("Enter Your Age");
        int nextInt = sc.nextInt();

        System.out.println("Hi " + inputString + "! you are"+ nextInt+"years");
    }

    public static void drawA() {


    }
}
