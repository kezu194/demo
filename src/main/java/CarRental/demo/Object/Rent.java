package CarRental.demo.Object;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Rent {

    long id;
    Person person;
    Dates date;
    Vehicule vehicule;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Embedded
    public Dates getDate() {
        return date;
    }

    public void setDate(Dates date) {
        this.date = date;
    }
    @ManyToOne
    @JsonIgnore
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @OneToOne
    public Vehicule getVehicule() {
        return this.vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public String toString(){
        return this.getPerson()+" , d'ID : "+this.person.getId()+" a louer un véhicule du :" +this.getDate();
    }
}