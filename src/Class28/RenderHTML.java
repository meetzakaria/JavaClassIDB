package Class28;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RenderHTML {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Java Student PC-9\\Desktop\\hhhh.html";
        renderHTML(filePath);
    }

    public static void renderHTML(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
            String rawHTML = content.toString();
            String textOnly = rawHTML.replaceAll("<[^>]*>", "");
            System.out.println(textOnly);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
