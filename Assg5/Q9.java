interface Searchable {
    public abstract void search(String keyword);
}

class Document implements Searchable {
    public void search(String keyword) {
        System.out.println("Searching for the keyword '" + keyword + "' in a document.");
    }
}

class WebPage implements Searchable {
    public void search(String keyword) {
        System.out.println("Searching for the keyword '" + keyword + "' in a web page.");
    }
}

public class Q9 {
    public static void main(String[] args) {
        Document document = new Document();
        WebPage webPage = new WebPage();

        document.search("Java");
        webPage.search("Java");
    }
}
