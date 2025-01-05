package Class14;


class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException(String message) {
        super(message);
    }
}


public class CustomUncheckedExceptionExample {
    public static void main(String[] args) {
        int num = 10, denom = 0;

        try {
            divide(num, denom);
        } catch (DivisionByZeroException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }


    public static void divide(int num, int denom) {
        if (denom == 0) {
            throw new DivisionByZeroException("Division by zero is not allowed!");
        }
        System.out.println("Result: " + (num / denom));
    }
}
