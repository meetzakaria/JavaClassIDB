package Class22;

class HRManager extends Employee {

    @Override
    public void work() {
        System.out.println("HR Manager is managing human resources");
    }

    public void addEmployee() {
        System.out.println("Adding a new employee to the system");
    }
}