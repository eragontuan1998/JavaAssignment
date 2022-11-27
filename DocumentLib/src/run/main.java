package run;

import model.Book;
import model.Document;
import model.DocumentFactory;
import model.DocumentManagement;

public class main {
    public static void main(String[] args) {
        DocumentManagement documentManagement = DocumentManagement.getInstance();
        documentManagement.add(new Book("1", "Conan", "05/12", "Gosho",2));
        documentManagement.add(new Book("2", "Conan", "05/12", "Gosho",2));
        documentManagement.add(new Book("3", "Conan", "05/12", "Gosho",2));
        documentManagement.add(new Book("4", "Conan", "05/12", "Gosho",2));
        documentManagement.show();
        documentManagement.delete("1");
        documentManagement.show();

    }
}
