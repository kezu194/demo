package CarRental.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, String> {
	
	@Override
	List<Car> findAll();
	
}
