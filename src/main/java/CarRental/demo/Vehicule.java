package CarRental.demo;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class Vehicule {
    private String plateNumber;
    private ArrayList<Rent> arrayRent;

    public Vehicule(){
        this.plateNumber="000000";
        this.arrayRent = new ArrayList<Rent>();
    }
    public Vehicule(String plate){
        this.plateNumber=plate;
        this.arrayRent = new ArrayList<Rent>();
    }
    public Vehicule(ArrayList<Rent> list){
        this.arrayRent = list;
        this.plateNumber="000000";
    }
    public Vehicule(String plate, ArrayList<Rent> list){
        this.arrayRent = list;
        this.plateNumber = plate;
    }

    @Id
    public String getPlateNumber(){
        return this.plateNumber;
    }
    public ArrayList<Rent> getArrayRent(){
        return this.arrayRent;
    }
    public void setPlateNumber(String plate){
        this.plateNumber=plate;
    }
    public void setArrayRent(ArrayList<Rent> array){
        this.arrayRent = array;
    }
}
