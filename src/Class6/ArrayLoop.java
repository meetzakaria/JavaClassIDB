package Class6;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("index position " + i + ": " + numbers[i]);
        }
    }
}
