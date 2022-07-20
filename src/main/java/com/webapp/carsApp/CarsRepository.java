package com.webapp.carsApp;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarsRepository extends JpaRepository<Car, Integer>{

    @Override
    List<Car> findAll();

}
