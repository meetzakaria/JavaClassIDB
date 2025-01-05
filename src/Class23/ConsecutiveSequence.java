package Class23;

import java.util.HashSet;

public class ConsecutiveSequence {

    public static boolean canFormConsecutive(int[] arr) {
        if (arr.length <= 1) {
            return true;
        }

        HashSet<Integer> uniqueNumbers = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (!uniqueNumbers.add(num)) {
                return false;
            }
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return (max - min + 1) == arr.length;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 2, 4, 1};
        int[] arr2 = {1, 3, 4, 5};
        int[] arr3 = {5, 4, 3, 2, 1};
        int[] arr4 = {1, 1, 2, 3};

        System.out.println(canFormConsecutive(arr1));
        System.out.println(canFormConsecutive(arr2));
        System.out.println(canFormConsecutive(arr3));
        System.out.println(canFormConsecutive(arr4));
    }
}
