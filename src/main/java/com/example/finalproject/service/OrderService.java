package com.example.finalproject.service;

import com.example.finalproject.models.Order;
import com.example.finalproject.models.dto.OrderCarDTO;
import com.example.finalproject.models.dto.OrderDTO;
import org.springframework.http.ResponseEntity;

public interface OrderService {
    OrderDTO save(Order order);
    ResponseEntity<?> makeOrder (OrderCarDTO dto);
    Order findByEmail(String email);
}
