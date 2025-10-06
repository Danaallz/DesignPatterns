// Prototype interface
interface DocumentTemplate extends Cloneable {
    DocumentTemplate clone();

    void showInfo();
}

// Concrete Prototype: Article
class ArticleTemplate implements DocumentTemplate {
    private String layout = "Single Column";
    private String style = "Modern";
    private String contentStructure = "Title, Author, Body, References";

    @Override
    public DocumentTemplate clone() {
        return new ArticleTemplate(); // Shallow clone for simplicity
    }

    @Override
    public void showInfo() {
        System.out.println("Article Template:");
        System.out.println("Layout: " + layout);
        System.out.println("Style: " + style);
        System.out.println("Structure: " + contentStructure);
        System.out.println();
    }
}

// Concrete Prototype: Report
class ReportTemplate implements DocumentTemplate {
    private String layout = "Two Column";
    private String style = "Formal";
    private String contentStructure = "Cover Page, TOC, Content, Appendix";

    @Override
    public DocumentTemplate clone() {
        return new ReportTemplate();
    }

    @Override
    public void showInfo() {
        System.out.println("Report Template:");
        System.out.println("Layout: " + layout);
        System.out.println("Style: " + style);
        System.out.println("Structure: " + contentStructure);
        System.out.println();
    }
}

// Concrete Prototype: Brochure
class BrochureTemplate implements DocumentTemplate {
    private String layout = "Tri-Fold";
    private String style = "Creative";
    private String contentStructure = "Cover, Product Info, Contact";

    @Override
    public DocumentTemplate clone() {
        return new BrochureTemplate();
    }

    @Override
    public void showInfo() {
        System.out.println("Brochure Template:");
        System.out.println("Layout: " + layout);
        System.out.println("Style: " + style);
        System.out.println("Structure: " + contentStructure);
        System.out.println();
    }
}

// Client
public class PublishingSystem {
    public static void main(String[] args) {
        // Original templates
        DocumentTemplate articlePrototype = new ArticleTemplate();
        DocumentTemplate reportPrototype = new ReportTemplate();
        DocumentTemplate brochurePrototype = new BrochureTemplate();

        // Clone and configure
        DocumentTemplate article1 = articlePrototype.clone();
        DocumentTemplate report1 = reportPrototype.clone();
        DocumentTemplate brochure1 = brochurePrototype.clone();

        article1.showInfo();
        report1.showInfo();
        brochure1.showInfo();
    }
}
