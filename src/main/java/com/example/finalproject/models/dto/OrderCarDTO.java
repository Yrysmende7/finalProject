package com.example.finalproject.models.dto;

import com.example.finalproject.models.Car;
import com.example.finalproject.models.Order;
import lombok.Data;

@Data
public class OrderCarDTO {
    Order order;
    Car car;
}
