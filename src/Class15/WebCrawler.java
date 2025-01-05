package Class15;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.net.URL;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class WebCrawler {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a URL: ");
        String url = input.nextLine();

        crawlWeb(url);

        input.close();
    }

    public static void crawlWeb(String startingURL) {
        ArrayList<String> pendingURLs = new ArrayList<>();
        ArrayList<String> traversedURLs = new ArrayList<>();


        pendingURLs.add(startingURL);

        while (!pendingURLs.isEmpty() && traversedURLs.size() < 100) {
            String currentURL = pendingURLs.remove(0);

            if (!traversedURLs.contains(currentURL)) {
                traversedURLs.add(currentURL);

                System.out.println("Crawling: " + currentURL);

                ArrayList<String> subURLs = getSubURLs(currentURL);

                for (String subURL : subURLs) {
                    if (!traversedURLs.contains(subURL)) {
                        pendingURLs.add(subURL);
                    }
                }
            }
        }
    }
    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> subURLs = new ArrayList<>();
        try {
            URL url = new URL(urlString);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                Pattern pattern = Pattern.compile("href=\"(http[^\"]+)\"");
                Matcher matcher = pattern.matcher(line);

                while (matcher.find()) {
                    String foundURL = matcher.group(1);
                    subURLs.add(foundURL);
                }
            }

            reader.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return subURLs;
    }
}