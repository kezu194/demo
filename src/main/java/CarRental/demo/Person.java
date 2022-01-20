package CarRental.demo;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@Entity
public class Person {

    long id;
    String name;
    List<Rent> rents = new ArrayList<Rent>();

    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    public List<Rent> getRents() {
        return rents;
    }

    public void setRents(List<Rent> rents) {
        this.rents = rents;
    }
}