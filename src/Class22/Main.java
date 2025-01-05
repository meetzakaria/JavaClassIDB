package Class22;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        HRManager hrManager = new HRManager();

        employee.work();
        System.out.println("Employee Salary: " + employee.getSalary());

        hrManager.work();
        hrManager.addEmployee();
        System.out.println("HR Manager Salary: " + hrManager.getSalary());
    }
}
