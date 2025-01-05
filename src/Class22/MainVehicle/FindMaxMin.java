package Class22.MainVehicle;

public class FindMaxMin {
    public static void main(String[] args) {
        int[] numbers = {10, 2, 34, 45, 67, 99, 0, -5, 23};  // অ্যারে

        // প্রথমে সর্বোচ্চ এবং সর্বনিম্ন মান শুরুতে অ্যারের প্রথম উপাদান হিসেবে ধরুন
        int max = numbers[0];
        int min = numbers[0];

        // অ্যারের সমস্ত উপাদান পরীক্ষা করুন
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];  // সর্বোচ্চ মান আপডেট
            }
            if (numbers[i] < min) {
                min = numbers[i];  // সর্বনিম্ন মান আপডেট
            }
        }

        // আউটপুট
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
