package CarRental.demo.Object;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Rent {

    long id;
    Person person;
    Dates beginRent;
    Dates endRent;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Dates getBeginRent() {
        return beginRent;
    }

    public void setBeginRent(Dates date) {
        this.beginRent = date;
    }

    public Dates getEndRent() {
        return endRent;
    }

    public void setEndRent(Dates date) {
        this.endRent = date;
    }

    @ManyToOne
    @JsonIgnore
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String toString(){
        return this.getPerson()+" , d'ID : "+this.person.getId()+" a louer un véhicule du :" +this.getBeginRent()+" au "+this.getEndRent();
    }
}