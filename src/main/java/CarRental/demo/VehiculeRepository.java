package CarRental.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface VehiculeRepository extends CrudRepository<Vehicule, String> {
	
	@Override
	List<Vehicule> findAll();
	
}
