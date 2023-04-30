package com.example.finalproject.models.dto;

import com.example.finalproject.models.*;
import lombok.Data;

import java.time.LocalDate;
@Data
public class CarDTO {
    String model;
    LocalDate mnfYears;
    Color color;
    EngineType engineType;
    String description;
    TransmissionType transmission;
    Double gasPer100;
    Category category;
    Boolean isActive;
    Double price;
}
