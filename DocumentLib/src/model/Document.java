package model;

import java.util.List;

public class Document {
    private String Id;
    private String Name;
    private String NumberOfPublish;

    public Document() {
    }


    public Document(String id, String name, String numberOfPublish) {
        Id = id;
        Name = name;
        NumberOfPublish = numberOfPublish;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNumberOfPublish() {
        return NumberOfPublish;
    }

    public void setNumberOfPublish(String numberOfPublish) {
        NumberOfPublish = numberOfPublish;
    }

    @Override
    public String toString() {
        return "Document{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", NumberOfPublish='" + NumberOfPublish + '\'' +
                '}';
    }
}