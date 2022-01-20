package CarRental.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import CarRental.demo.Object.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, String> { }
