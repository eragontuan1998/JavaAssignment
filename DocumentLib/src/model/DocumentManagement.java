package model;

import javax.swing.event.DocumentEvent;
import java.util.ArrayList;
import java.util.List;

public class DocumentManagement implements FunctionDocument {
    private static DocumentManagement instance;
    private List<Document> documentList;
    private List<Document> category;

    private DocumentManagement() {
        documentList = new ArrayList<>();
    }

    public static synchronized DocumentManagement getInstance() {
        if (instance == null) {
            instance = new DocumentManagement();
        }
        return instance;
    }

    //TODO: Show all documents are existing in documentList
    @Override
    public void show() {
        if (documentList == null) {
            return;
        }
        for (Document c : documentList) {
            if (c instanceof Book) {
                Book b = (Book) c;
                System.out.println(b.toString());
            } else if (c instanceof Magazine) {
                Magazine m = (Magazine) c;
                System.out.println(m.toString());
            } else if (c instanceof Newspaper) {
                Newspaper n = (Newspaper) c;
                System.out.println(n.toString());
            }
        }
    }

    // TODO: Delete
    @Override
    public void delete(String id) {
        //TODO: Check id of d existed in documentList
        Document item = checkId(id);
        if (item == null) {
            System.err.println("Id was not existed");
            return;
        }
        //TODO: delete object based on documentList
        documentList.remove(item);
    }

    @Override
    public void add(Document d) {
        //TODO: Check id of d existed in documentList
        if (checkId(d.getId()) != null) {
            System.err.println("Id existed");
            return;
        }
        //TODO: add object into documentList
        documentList.add(d);
    }

    @Override
    public List<Document> find(String type) {
        //TODO: Check id of d existed in documentList
        category = new ArrayList<>();
        for (Document item : documentList) {
            if (item instanceof Book && "Book".equalsIgnoreCase(type)) {
                category.add(item);
            } else if (item instanceof Magazine && "Magazine".equalsIgnoreCase(type)) {
                category.add(item);
            } else if (item instanceof Newspaper && "Newspaper".equalsIgnoreCase(type)) {
                category.add(item);
            }
        }
        return category;
    }


    private Document checkId(String id) {
        for (Document c : documentList) {
            if (c.getId().equalsIgnoreCase(id)) {
                return c;
            }
        }
        return null;
    }
}
