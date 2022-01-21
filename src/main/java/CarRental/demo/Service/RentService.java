package CarRental.demo.Service;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import CarRental.demo.Object.Dates;
import CarRental.demo.Object.Person;
import CarRental.demo.Object.Rent;
import CarRental.demo.Object.Car;
import CarRental.demo.Object.Van;
import CarRental.demo.Repository.RentRepository;
import CarRental.demo.Repository.PersonRepository;
import CarRental.demo.Repository.VehiculeRepository;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class RentService {
	
	RentRepository rentRepository;
	PersonRepository personRepository;
	VehiculeRepository vehiculeRepository;
	
	@Autowired
	public RentService(RentRepository rentRepository, VehiculeRepository vehicuRepository, PersonRepository personRepository) {
		this.rentRepository = rentRepository;
		this.vehiculeRepository = vehicuRepository;
		this.personRepository = personRepository;
		
		Car car = new Car("55CC66", 1500);
		vehiculeRepository.save(car);
		Van van = new Van("77DD88", 2000);
		vehicuRepository.save(van);

		Person benjamin = new Person("Benjamin");
		personRepository.save(benjamin);
		
        Rent rent1 = new Rent();
		rent1.setDate(new Dates("01/01/22","01/02/22"));
		rent1.setPerson(benjamin);
		rent1.setVehicule(car);
		rentRepository.save(rent1);

		Rent rent2 = new Rent();
		rent2.setDate(new Dates("15/01/22", "01/06/22"));
		rent2.setPerson(benjamin);
		rent2.setVehicule(van);
		rentRepository.save(rent2);
	}
	
	@GetMapping("/rents")
	public List<Rent> getListOfRents(){
		return rentRepository.findAll(); 
	}
	
	@PostMapping("/rents")
	public void addRents(@RequestBody Rent rent) throws Exception{
		System.out.println(rent);
		rentRepository.findAll().add(rent);
	}

	@GetMapping("/rents/{id}")
	public Rent getRent(@PathVariable(value = "id") long id){
		for(Rent rent: rentRepository.findAll()){
			if(rent.getId()==id){
				return rent;
			}
		}
		return null;
	}

	@PutMapping("/rent/{id}")
	public void rent(@PathVariable("id") long id, @RequestParam(value="rent",
			required = true)boolean rent, @RequestBody Dates dates){
		for(Rent rents: rentRepository.findAll()){
			if(rents.getId()==id){
			}
		}
	}

}
