package CarRental.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class Vehicule {
    private String plateNumber;

    public Vehicule(){
        this.plateNumber="000000";
    }
    public Vehicule(String plate){
        this.plateNumber=plate;
    }
    @Id
    public String getPlateNumber(){
        return this.plateNumber;
    }
    public void setPlateNumber(String plate){
        this.plateNumber=plate;
    }
}
