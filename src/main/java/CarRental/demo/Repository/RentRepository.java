package CarRental.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import CarRental.demo.Object.Rent;

public interface RentRepository extends JpaRepository<Rent, String> { }
