package Class27.Exam;

class Square extends Rectangle {

    public Square(double side) throws NegativeNumberException {
        super(side, side);
        if (side < 0) {
            throw new NegativeNumberException("Negative number not Supported");
        }
    }
}