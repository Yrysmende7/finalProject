package com.example.finalproject.controller;

import com.example.finalproject.models.Car;
import com.example.finalproject.models.Order;
import com.example.finalproject.models.dto.OrderCarDTO;
import com.example.finalproject.models.dto.OrderDTO;
import com.example.finalproject.service.OrderService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import static org.hibernate.cfg.AvailableSettings.USER;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(tags = USER)
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;
    @PostMapping("/save")
    public OrderDTO save(@RequestBody Order order){
        return orderService.save(order);
    }
    @PostMapping("/makeOrder")
    public ResponseEntity<?> makeOrder(@RequestBody OrderCarDTO dto) {
        return orderService.makeOrder(dto);
    }
}
