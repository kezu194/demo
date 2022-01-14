package CarRental.demo;

public class Dates {

    String date;

    public Dates(String d){
        this.date=d;
    }

    public String getdate() {
        return date;
    }

    public void setdate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "date='" + date ;
    }
}