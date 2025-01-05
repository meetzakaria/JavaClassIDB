package Class24;

class Employee {
    String name;
    int yearOfJoining;
    String address;

    public Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public void display() {
        System.out.printf("%-10s %-15d %-30s\n", name, yearOfJoining, address);
    }
}
