package Class21;

interface Searchable {
    void search(String keyword);
}

class Document implements Searchable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public void search(String keyword) {
        if (content.contains(keyword)) {
            System.out.println("Keyword found in document: " + keyword);
        } else {
            System.out.println("Keyword not found in document: " + keyword);
        }
    }
}

class WebPage implements Searchable {
    private String htmlContent;

    public WebPage(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    @Override
    public void search(String keyword) {
        if (htmlContent.contains(keyword)) {
            System.out.println("Keyword found in web page: " + keyword);
        } else {
            System.out.println("Keyword not found in web page: " + keyword);
        }
    }
}

public class SearchTest {
    public static void main(String[] args) {
        Document doc = new Document("This is a sample document. It contains important information.");
        WebPage webpage = new WebPage("<html><body><h1>Welcome to the web page</h1><p>Important content here</p></body></html>");

        doc.search("important");
        doc.search("missing");

        webpage.search("web");
        webpage.search("absent");
    }
}
