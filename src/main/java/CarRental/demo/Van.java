package CarRental.demo;

import javax.persistence.Entity;

@Entity
public class Van extends Vehicule {
    private double maxWeight;

    public Van(){
        super();
        this.maxWeight = 1000;
    }

    public Van(double weight){
        super();
        this.maxWeight = weight;
    }
    public Van(String plate){
        super(plate);
        this.maxWeight = 1000;
    }
    public Van(String plate, double weight){
        super(plate);
        this.maxWeight = weight;
    }

    public double getMaxWeight(){
        return this.maxWeight;
    }

    public void setMaxWeight(double weight){
        this.maxWeight=weight;
    }

    public String toString() {
		return "Van{" +
				"plateNumber='" + this.getPlateNumber() + '\'' +
				", MaxWeight=" + maxWeight +
				'}';
	}
}
