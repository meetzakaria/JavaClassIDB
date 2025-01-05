import java.util.*;

public class KeithNumber{

    // Function to check whether a number is Keith number or not
    public static boolean isKeithNumber(int number) {
        // Convert the number into a list of digits
        List<Integer> digits = new ArrayList<>();
        int temp = number;

        // Extract digits and add to list
        while (temp > 0) {
            digits.add(0, temp % 10);
            temp /= 10;
        }

        // Create a sequence using the digits
        List<Integer> sequence = new ArrayList<>(digits);

        // Generate the sequence until we either reach the number or surpass it
        while (true) {
            int sum = 0;
            // Calculate the sum of the last digits equal to the number of initial digits
            for (int i = sequence.size() - digits.size(); i < sequence.size(); i++) {
                sum += sequence.get(i);
            }

            // If sum equals the number, it's a Keith number
            if (sum == number) {
                return true;
            }

            // If sum is greater than the number, it's not a Keith number
            if (sum > number) {
                return false;
            }

            // Add the sum to the sequence and continue the process
            sequence.add(sum);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a Keith number
        if (isKeithNumber(number)) {
            System.out.println(number + " is a Keith number.");
        } else {
            System.out.println(number + " is not a Keith number.");
        }

        scanner.close();
    }
}
