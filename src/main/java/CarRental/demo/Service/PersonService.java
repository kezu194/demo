package CarRental.demo.Service;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import CarRental.demo.Object.Dates;
import CarRental.demo.Object.Person;
import CarRental.demo.Repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class PersonService {
	
	// private List<Car> cars = new ArrayList<Car>();
	
	PersonRepository personRepository;
	
	@Autowired
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
        Person michelle = new Person();
        michelle.setName("Michelle");
        personRepository.save(michelle);
        Person alice = new Person();
        alice.setName("Alice");
		personRepository.save(alice);
	}
	
	@GetMapping("/personnes")
	public List<Person> getListOfPersons(){
		return personRepository.findAll(); // <=> select * from Car
	}
	
	@PostMapping("/personnes")
	public void addPersonne(@RequestBody Person person) throws Exception{
		System.out.println(person);
		personRepository.findAll().add(person);
	}

	@GetMapping("/personnes/{id}")
	public Person getPerson(@PathVariable(value = "id") long id){
		for(Person per: personRepository.findAll()){
			if(per.getId()==id){
				return per;
			}
		}
		return null;
	}

	@PutMapping("/personnes/{id}")
	public void rent(@PathVariable("id") long id, @RequestParam(value="rent",
			required = true)boolean rent, @RequestBody Dates dates){
		for(Person per: personRepository.findAll()){
			if(per.getId()==id){
			}
		}
	}

}
