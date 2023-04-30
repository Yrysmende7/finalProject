package com.example.finalproject.service.impl;

import com.example.finalproject.mappers.CarMapper;
import com.example.finalproject.models.Car;
import com.example.finalproject.models.Category;
import com.example.finalproject.models.dto.CarDTO;
import com.example.finalproject.repository.CarRepo;
import com.example.finalproject.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepo carRepo;
    private final CarMapper carMapper;
    @Override
    public CarDTO save(Car car) {
        return carMapper.toDto(carRepo.save(car));
    }

    @Override
    public List<Car> findAll() {
        return carMapper.toEntityList(carRepo.findAll());
    }

    @Override
    public List<Car> findByModel(String model) {
        return carMapper.toEntityList(carRepo.findCarByModel(model));
    }

    @Override
    public List<Car> findActive() {
        return carMapper.toEntityList(carRepo.findAllByIsActiveTrue());
    }

    @Override
    public List<Car> findCarsByCategory(Category category) {
        return carMapper.toEntityList(carRepo.findCarsByCategory(category));
    }
}
