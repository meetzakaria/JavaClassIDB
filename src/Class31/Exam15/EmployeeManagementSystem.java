package Class31.Exam15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Read employees from file
        // Read employees from file
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Java Student PC-9\\Desktop\\employees.csv"))) {
            String line;

            // Skip the header line
            line = br.readLine(); // এটি হেডার লাইন বাদ দেবে।

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0].trim();
                int id = Integer.parseInt(parts[1].trim());
                double salary = Double.parseDouble(parts[2].trim());
                String type = parts[3].trim();

                switch (type) {
                    case "FullTime":
                        employees.add(new FullTimeEmployee(name, id, salary));
                        break;
                    case "PartTime":
                        employees.add(new PartTimeEmployee(name, id, salary));
                        break;
                    case "Contract":
                        employees.add(new ContractEmployee(name, id, salary));
                        break;
                    default:
                        System.out.println("Unknown employee type: " + type);
                }
            }
        } catch (IOException | InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }


        // Write payroll information to a file
        try (PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Java Student PC-9\\Desktop\\payroll.txt"))) {
            for (Employee employee : employees) {
                double tax = employee.calculateTax();
                pw.println(employee + ", Tax: " + tax);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}