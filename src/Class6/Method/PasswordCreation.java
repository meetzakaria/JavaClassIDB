import java.util.Scanner;

public class PasswordCreation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid. It must be at least 8 characters long, include at least one uppercase letter, and one special symbol.");
        }

        scanner.close();
    }

    public static boolean isValidPassword(String password) {
        // Check length, uppercase, and special characters
        String passwordPattern = "^(?=.[A-Z])(?=.[@#$%^&+=!])(?=\\S+$).{8,}$";
        return password.matches(passwordPattern);
    }
}