import java.util.Random;

public class CountLetterInArray {
    public static void main(String[] args) {

        char[] chars = createArray();

        System.out.println("The generated array is:");
        displayArray(chars);

        int[] counts = countLetters(chars);

        System.out.println("\nLetter counts:");
        displayCounts(counts);
    }

    public static char[] createArray() {
        char[] chars = new char[100];
        Random random = new Random();

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ('a' + random.nextInt(26));
        }

        return chars;
    }

    public static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }

    public static int[] countLetters(char[] chars) {
        int[] counts = new int[26];
        for (char c : chars) {
            counts[c - 'a']++;
        }
        return counts;
    }

    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%c: %d\t", (char) (i + 'a'), counts[i]);
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
    }
}