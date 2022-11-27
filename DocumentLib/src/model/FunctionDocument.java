package model;

import java.util.List;

public interface FunctionDocument {
    void show();
    void delete(String id);

    void add(Document d);
    List<Document> find(String type);
}
