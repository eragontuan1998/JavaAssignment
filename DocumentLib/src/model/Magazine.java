package model;

public class Magazine extends Document {
    private String IdPublish;
    private int MonthPublish;

    public Magazine() {
    }

    public Magazine(String idPublish, int monthPublish) {
        IdPublish = idPublish;
        MonthPublish = monthPublish;
    }

    public Magazine(String id, String name, String numberOfPublish, String idPublish, int monthPublish) {
        super(id, name, numberOfPublish);
        IdPublish = idPublish;
        MonthPublish = monthPublish;
    }

    public String getIdPublish() {
        return IdPublish;
    }

    public void setIdPublish(String idPublish) {
        IdPublish = idPublish;
    }

    public int getMonthPublish() {
        return MonthPublish;
    }

    public void setMonthPublish(int monthPublish) {
        MonthPublish = monthPublish;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "IdPublish='" + IdPublish + '\'' +
                ", MonthPublish=" + MonthPublish +
                "} " + super.toString();
    }
}
