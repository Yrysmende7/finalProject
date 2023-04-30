package com.example.finalproject.repository;

import com.example.finalproject.models.Car;
import com.example.finalproject.models.Category;
import com.example.finalproject.models.dto.CarDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepo extends JpaRepository<Car,Long> {
    List<Car> findCarByModel(String model);
    List<Car> findAllByIsActiveTrue();
    List<Car> findCarsByCategory(Enum<Category> category);
}
