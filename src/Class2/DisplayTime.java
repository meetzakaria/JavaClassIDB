package Class2;

import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt the user from input
        System.out.print("Enter an integer for second: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60;     //Find minutes in secons
        int reminingSeconds = seconds % 60 ;
        System.out.print(seconds + " seconds is " + minutes + " minutes and " + reminingSeconds + " Seconds ");
    }
}
