package CarRental.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;

@RestController
public class CarRentalService {
	
	// private List<Car> cars = new ArrayList<Car>();
	
	CarRepository carRepository;
	
	@Autowired
	public CarRentalService(CarRepository carRepository) {
		this.carRepository = carRepository;
		Car car = new Car("11AA22", "Ferrari", 1000);
		carRepository.save(car);
		car = new Car("33BB44", "Porshe", 2222);
		carRepository.save(car);
	}
	
	@GetMapping("/cars")
	public List<Car> getListOfCars(){
		return carRepository.findAll(); // <=> select * from Car
	}
	
	@PostMapping("/cars")
	public void addCar(@RequestBody Car car) throws Exception{
		System.out.println(car);
		carRepository.findAll().add(car);
	}

	@GetMapping("/cars/{plateNumber}")
	public Car getCar(@PathVariable(value = "plateNumber") String plateNumber){
		for(Car car: carRepository.findAll()){
			if(car.getPlateNumber().equals(plateNumber)){
				return car;
			}
		}
		return null;
	}

	@PutMapping("/cars/{plateNumber}")
	public void rent(@PathVariable("plateNumber") String plateNumber, @RequestParam(value="rent",
			required = true)boolean rent, @RequestBody Dates dates){
		for(Car car: carRepository.findAll()){
			if(car.getPlateNumber().equals(plateNumber)){
				car.setDates(dates);
				car.setRented(true);
			}
		}
	}

}
