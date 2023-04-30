package com.example.finalproject.service;

import com.example.finalproject.models.Car;
import com.example.finalproject.models.Category;
import com.example.finalproject.models.dto.CarDTO;

import java.util.List;

public interface CarService {
    CarDTO save (Car car);
    List<Car> findAll();
    List<Car> findByModel(String model);
    List<Car> findActive();
    List<Car> findCarsByCategory(Category category);
}
