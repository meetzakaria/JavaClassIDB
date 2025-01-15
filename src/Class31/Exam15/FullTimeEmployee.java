package Class31.Exam15;

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int id, double salary) throws InvalidSalaryException {
        super(name, id, salary);
    }

    @Override
    public double calculateTax() {
        return salary * 0.2; // 20% tax
    }
}