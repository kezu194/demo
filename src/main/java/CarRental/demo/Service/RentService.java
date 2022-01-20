package CarRental.demo.Service;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import CarRental.demo.Object.Dates;
import CarRental.demo.Object.Rent;
import CarRental.demo.Repository.RentRepository;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class RentService {
	
	// private List<Car> cars = new ArrayList<Car>();
	
	RentRepository rentRepository;
	
	@Autowired
	public RentService(RentRepository rentRepository) {
        Rent rent1 = new Rent();
        rent1.setBeginRent(new Dates("01/01/22"));
        rent1.setEndRent(new Dates("01/02/22"));
		rentRepository.save(rent1);
	}
	
	@GetMapping("/rents")
	public List<Rent> getListOfRents(){
		return rentRepository.findAll(); // <=> select * from Car
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
