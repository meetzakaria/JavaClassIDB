package Class21;

import java.nio.file.*;
import java.util.List;

public class ReadTextFile {
    public static void main(String[] args) throws Exception {
        Path filePath = Paths.get("C:\\Users\\Java Student PC-9\\Desktop\\Terminal Command.txt");

        List<String> lines = Files.readAllLines(filePath);

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
