package CarRental.demo.Object;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@Entity
public abstract class Vehicule {
    private String plateNumber;
    private List<Rent> rents = new ArrayList<Rent>();

    public Vehicule(){
        this.plateNumber="000000";
        this.rents = new ArrayList<Rent>();
    }
    public Vehicule(String plate){
        this.plateNumber=plate;
        this.rents = new ArrayList<Rent>();
    }
    public Vehicule(List<Rent> list){
        this.rents = list;
        this.plateNumber="000000";
    }
    public Vehicule(String plate, List<Rent> list){
        this.rents = list;
        this.plateNumber = plate;
    }

    @Id
    public String getPlateNumber(){
        return this.plateNumber;
    }

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    public List<Rent> getrents(){
        return this.rents;
    }
    public void setPlateNumber(String plate){
        this.plateNumber=plate;
    }
    public void setRents(List<Rent> array){
        this.rents = array;
    }
}
