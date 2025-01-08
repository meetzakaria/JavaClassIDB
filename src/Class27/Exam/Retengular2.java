package Class27.Exam;

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) throws NegativeNumberException {
        if (width < 0 || height < 0) {
            throw new NegativeNumberException("Negative number not Supported");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}