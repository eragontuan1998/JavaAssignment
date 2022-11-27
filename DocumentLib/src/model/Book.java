package model;

public class Book extends Document {
    private String author;
    private int pageNum;

    public Book() {
    }

    public Book(String author, int pageNum) {
        this.author = author;
        this.pageNum = pageNum;
    }

    public Book(String id, String name, String numberOfPublish, String author, int pageNum) {
        super(id, name, numberOfPublish);
        this.author = author;
        this.pageNum = pageNum;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", pageNum=" + pageNum +
                "} " + super.toString();
    }
}
