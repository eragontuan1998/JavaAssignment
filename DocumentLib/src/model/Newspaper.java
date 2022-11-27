package model;

public class Newspaper extends Document {
    private int DayPublish;

    public Newspaper() {
    }

    public Newspaper(int dayPublish) {
        DayPublish = dayPublish;
    }

    public Newspaper(String id, String name, String numberOfPublish, int dayPublish) {
        super(id, name, numberOfPublish);
        DayPublish = dayPublish;
    }

    public int getDayPublish() {
        return DayPublish;
    }

    public void setDayPublish(int dayPublish) {
        DayPublish = dayPublish;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "DayPublish=" + DayPublish +
                "} " + super.toString();
    }
}