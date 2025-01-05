package Class24;

class EmployeeDetails {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Zakaria", 1994, "Agargaon, Dhaka");
        Employee emp2 = new Employee("Faysal", 2000, "Demra, Dhaka");
        Employee emp3 = new Employee("Ashik", 1999, "Mirpur, Dhaka");

        System.out.printf("%-10s %-15s %-30s\n", "Name", "Year of Joining", "Address");
        emp1.display();
        emp2.display();
        emp3.display();
    }
}