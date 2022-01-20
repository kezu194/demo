package CarRental.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Rent {

    long id;
    Person person;
    Date beginRent;
    Date endRent;

    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getBeginRent() {
        return beginRent;
    }

    public void setBeginRent(Date date) {
        this.beginRent = date;
    }

    public Date getEndRent() {
        return endRent;
    }

    public void setEndRent(Date date) {
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
}