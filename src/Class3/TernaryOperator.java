package Class3;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner ter = new Scanner(System.in);

        System.out.println("Enter your Number");
        int NumberOne = ter.nextInt();
        ter.nextLine();

        System.out.println("Enter your Number");
        int NumberTwo = ter.nextInt();
        ter.nextLine();

        int max;


        System.out.println("First name" + NumberOne);
        System.out.println("Second name" + NumberTwo);

        max =  (NumberOne>NumberTwo) ? NumberOne : NumberTwo ;

        System.out.println(" Maximum Number is " + max);
    }
}
