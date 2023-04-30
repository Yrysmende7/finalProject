package com.example.finalproject.controller;

import com.example.finalproject.models.Car;
import com.example.finalproject.models.Category;
import com.example.finalproject.models.dto.CarDTO;
import com.example.finalproject.service.CarService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.hibernate.cfg.AvailableSettings.USER;

@RestController
@Api(tags = USER)
@RequiredArgsConstructor
@RequestMapping("/car")
public class CarController {
    private final CarService carService;
    @PostMapping("/save")
    public CarDTO save(@RequestBody Car car){
        return carService.save(car);
    }
    @GetMapping("/findAll")
    public List<Car> findAll(){
        return carService.findAll();
    }
    @GetMapping("findByModel")
    public  List<Car> findByModel(@RequestParam String model){
        return carService.findByModel(model);
    }
    @GetMapping("findByActive")
    public  List<Car> findActive(){
        return carService.findActive();
    }
    @GetMapping("/findByCategory")
    public List<Car> findByCategory(@RequestParam Category category){
        return carService.findCarsByCategory(category);
    }
}
