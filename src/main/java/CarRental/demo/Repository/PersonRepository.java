package CarRental.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import CarRental.demo.Object.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
