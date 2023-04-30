package com.example.finalproject.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "car_tb")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String model;
    @JsonFormat(pattern = "dd-MM-yyyy")
    LocalDate mnfYears;
    @JoinColumn(name = "color_id",nullable = false,unique = false)
    @Enumerated(EnumType.ORDINAL)
    Color color;
    @JoinColumn(name = "engine_id",nullable = false,unique = false)
    @Enumerated(EnumType.ORDINAL)
    EngineType engineType;
    String description;
    @JoinColumn(name = "transmission_id",nullable = false,unique = false)
    @Enumerated(EnumType.ORDINAL)
    TransmissionType transmission;
    Double gasPer100;
    @JoinColumn(name = "category_id",nullable = false,unique = false)
    @Enumerated(EnumType.ORDINAL)
    Category category;
    Boolean isActive;
    Double price;
}
