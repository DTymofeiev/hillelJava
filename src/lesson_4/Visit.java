package lesson_4;

public class Visit {
    private String date;

    public Visit(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "date='" + date + '\'' +
                '}';
    }
}

