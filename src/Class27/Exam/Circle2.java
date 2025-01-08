package Class27.Exam;

class Circle2 extends Shape {
    private double radius;

    public Circle2(double radius) throws NegativeNumberException {
        if (radius < 0) {
            throw new NegativeNumberException("Negative number not Supported");
        }
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}