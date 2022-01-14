package CarRental.demo;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Person {
    private String name;
    private ArrayList<Rent> listRent;
    private Long id;

    public Person(){
        this.name = "Default";
        this.listRent = new ArrayList<Rent>();
    }
    public Person(String n){
        this.name = n;
        this.listRent = new ArrayList<Rent>();
    }
    public Person(ArrayList<Rent> list){
        this.listRent = list;
        this.name = "Default";

    }
    public Person(ArrayList<Rent> list, String n){
        this.name = n;
        this.listRent = list;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Rent> getArrayRent(){
        return this.listRent;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setArrayRent(ArrayList<Rent> array){
        this.listRent = array;
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
