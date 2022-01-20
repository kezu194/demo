package CarRental.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import CarRental.demo.Object.Person;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Optional<Person> findByName(String name);
}
