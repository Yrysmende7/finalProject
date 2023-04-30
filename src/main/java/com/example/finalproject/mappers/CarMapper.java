package com.example.finalproject.mappers;

import com.example.finalproject.models.Car;
import com.example.finalproject.models.dto.CarDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);
    CarDTO toDto (Car car);
    Car toEntity (CarDTO carDTO);
    List<Car> toEntityList (List<Car> listCarDTO);
}
