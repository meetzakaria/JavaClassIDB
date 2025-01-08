package Class27.Exam;

public class Main {
    public static void main(String[] args) {
        try {

            Shape circle = new Circle2(5.0);
            Shape rectangle = new Rectangle(4.0, 6.0);
            Shape square = new Square(-4.0);


            System.out.println("Circle Area: " + circle.calculateArea());
            System.out.println("Rectangle Area: " + rectangle.calculateArea());
            System.out.println("Square Area: " + square.calculateArea());
        } catch (NegativeNumberException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}