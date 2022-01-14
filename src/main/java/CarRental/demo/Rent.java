package CarRental.demo;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Rent {
    private Dates beginRent;
    private Dates endRent;
    private Long id;

    public Rent(){
        this.beginRent = new Dates("01/01/21");
        this.endRent = new Dates("31/12/21");
    }

    public Rent(String begin, String end){
        this.beginRent = new Dates(begin);
        this.endRent = new Dates(end);
    }

    public Dates getBeginRent(){
        return this.beginRent;
    }

    public Dates getEndRent(){
        return this.endRent;
    }

    public void setBeginRent(Dates d){
        this.beginRent=d;
    }
    
    public void setEndRent(Dates d){
        this.endRent=d;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;

    }
    public void setId(Long id ){
        this.id = id;
    }
}
