package Class31.Exam15;

class ContractEmployee extends Employee {
    public ContractEmployee(String name, int id, double salary) throws InvalidSalaryException {
        super(name, id, salary);
    }

    @Override
    public double calculateTax() {
        return salary * 0.15; // 15% tax
    }
}