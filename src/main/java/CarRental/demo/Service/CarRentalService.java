package CarRental.demo.Service;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import CarRental.demo.Object.Car;
import CarRental.demo.Object.Dates;
import CarRental.demo.Object.Van;
import CarRental.demo.Object.Vehicule;
import CarRental.demo.Repository.VehiculeRepository;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class CarRentalService {
	
	// private List<Car> cars = new ArrayList<Car>();
	
	VehiculeRepository vehiculeRepository;
	
	@Autowired
	public CarRentalService(VehiculeRepository vehiculeRepository) {
		this.vehiculeRepository = vehiculeRepository;
		Car car = new Car("11AA22", 1000);
		vehiculeRepository.save(car);
		Van van = new Van("33BB44", 2222);
		vehiculeRepository.save(van);
	}
	
	@GetMapping("/cars")
	public List<Vehicule> getListOfCars(){
		return vehiculeRepository.findAll(); // <=> select * from Car
	}
	
	@PostMapping("/cars")
	public void addCar(@RequestBody Vehicule car) throws Exception{
		System.out.println(car);
		vehiculeRepository.findAll().add(car);
	}

	@GetMapping("/cars/{plateNumber}")
	public Vehicule getCar(@PathVariable(value = "plateNumber") String plateNumber){
		for(Vehicule car: vehiculeRepository.findAll()){
			if(car.getPlateNumber().equals(plateNumber)){
				return car;
			}
		}
		return null;
	}

	@PutMapping("/cars/{plateNumber}")
	public void rent(@PathVariable("plateNumber") String plateNumber, @RequestParam(value="rent",
			required = true)boolean rent, @RequestBody Dates dates){
		for(Vehicule car: vehiculeRepository.findAll()){
			if(car.getPlateNumber().equals(plateNumber)){
			}
		}
	}

}
