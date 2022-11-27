package model;

public class DocumentFactory {
    public Document getTypeDocument(String type) {
        if (type == null) {
            return null;
        } else if ("Book".equalsIgnoreCase(type)) {
            return new Book();
        } else if ("Newspaper".equalsIgnoreCase(type)) {
            return new Newspaper();
        } else if ("Magazine".equalsIgnoreCase(type)) {
            return new Magazine();
        }
        return null;
    }
}
