package Class15;

import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 7, 3, 8};

        HashSet<Integer> seenNumbers = new HashSet<>();
        boolean hasDuplicates = false;

        for (int num : numbers) {

            if (!seenNumbers.add(num)) {
                System.out.println("Duplicate value found: " + num);
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate values found.");
        }
    }
}
