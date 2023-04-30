package com.example.finalproject.models.dto;

import com.example.finalproject.models.Address;
import com.example.finalproject.models.Car;
import com.example.finalproject.models.Discount;
import com.example.finalproject.models.Price;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderDTO {
    Boolean babySeat;
    Boolean withDriver;
    String clientName;
    Integer clientPhone;
    String email;
    LocalDateTime dateTimeFrom;
    LocalDateTime dateTimeTo;
    Boolean isAvailable;
    Address address;
}
