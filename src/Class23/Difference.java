package Class23;

public class Difference {
    public static int calculateDifference(int[] numbers) {
        int evenSum = 0;
        int oddSum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        return evenSum - oddSum;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(calculateDifference(numbers));
    }
}
