package Class32;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FileReaderExample {

    public static void main(String[] args) {
        // Path to the file
        String filePath = "your_file_path_here.txt";  // Update with your file path
        try {
            // Call the function to read file and count occurrences
            countOccurrences(filePath);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void countOccurrences(String filePath) throws IOException {
        // Create a BufferedReader to read the file
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String line;
        int spaceCount = 0;
        int characterCount = 0;
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Read through the file line by line
        while ((line = reader.readLine()) != null) {
            // Count spaces and characters
            for (char c : line.toCharArray()) {
                if (c == ' ') {
                    spaceCount++;
                }
                if (Character.isLetterOrDigit(c)) {
                    characterCount++;
                }
                // Update frequency of each character
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
        }

        reader.close();

        // Print the counts
        System.out.println("Total number of spaces: " + spaceCount);
        System.out.println("Total number of characters (letters/digits): " + characterCount);
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Randomly select a character and show its occurrence
        Random rand = new Random();
        char randomChar = (char) (rand.nextInt(26) + 'a'); // Generate a random character from a to z
        System.out.println("Random character: " + randomChar);
        System.out.println("Occurrences of '" + randomChar + "': " + charFrequency.getOrDefault(randomChar, 0));
    }
}
