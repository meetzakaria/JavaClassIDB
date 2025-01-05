package Class6.Method;

public class TestRandomCharacter {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175; // Total number of characters to generate
        final int CHARS_PER_LINE = 25;  // Characters to display per line

        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = getRandomLowerCaseLetter(); // Generate random lowercase letters
            System.out.print(ch); // Print the character

            // Add a new line after CHARS_PER_LINE characters
            if ((i + 1) % CHARS_PER_LINE == 0) {
                System.out.println();
            }
        }
    }

    // Generate a random character between two given characters
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    // Generate a random lowercase letter (a-z)
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    // Generate a random uppercase letter (A-Z)
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    // Generate a random digit character (0-9)
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    // Generate a random character (any character in Unicode)
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
