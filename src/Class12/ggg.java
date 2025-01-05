import java.util.Scanner;

public class ggg {
    public static void main(String[] args) {
        // Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input Mid Exam mark (out of 100)
        System.out.print("Enter Mid Exam mark: ");
        double midExamMark = scanner.nextDouble();

        // Input Monthly Exam mark (out of 100)
        System.out.print("Enter Monthly Exam mark: ");
        double monthlyExamMark = scanner.nextDouble();

        // Calculate weighted marks
        double midExamPercentage = midExamMark * 0.20;  // 20% of Mid Exam mark
        double monthlyExamPercentage = monthlyExamMark * 0.40;  // 40% of Monthly Exam mark

        // Calculate total percentage
        double totalMarks = midExamPercentage + monthlyExamPercentage;

        // Calculate total marks by adding both exam marks
        double totalMarksOutOf100 = midExamMark + monthlyExamMark;

        // Print results
        System.out.println("Mid Exam Percentage: " + midExamPercentage + "%");
        System.out.println("Monthly Exam Percentage: " + monthlyExamPercentage + "%");
        System.out.println("Total Marks (out of 100): " + totalMarksOutOf100);

        // Show final percentage out of 100
        System.out.println("Total Percentage: " + totalMarks + "%");

        // Check pass/fail
        if (totalMarks >= 30) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        // Close the scanner
        scanner.close();
    }
}
