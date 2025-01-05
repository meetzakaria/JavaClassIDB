package Class14;

class InvalidAgeException extends Exception {

    public InvalidAgeException() {
        super("Invalid age entered!");
    }


    public InvalidAgeException(String message) {
        super(message);
    }
}


public class ZakariaException {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }


    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above!");
        }
        System.out.println("Valid age: " + age);
    }
}
