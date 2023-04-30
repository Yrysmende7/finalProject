package com.example.finalproject.service.impl;

import com.example.finalproject.mappers.CarMapper;
import com.example.finalproject.mappers.OrderMapper;
import com.example.finalproject.models.Order;
import com.example.finalproject.models.dto.OrderCarDTO;
import com.example.finalproject.models.dto.OrderDTO;
import com.example.finalproject.repository.CarRepo;
import com.example.finalproject.repository.OrderRepo;
import com.example.finalproject.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepo orderRepo;
    private final OrderMapper orderMapper;
    private final CarMapper carMapper;
    private final CarRepo carRepo;

    @Override
    public OrderDTO save(Order order) {
        return orderMapper.toDTO(orderRepo.save(order));

    }

    @Override
    public ResponseEntity<?> makeOrder(OrderCarDTO dto) {
        orderRepo.save(dto.getOrder());
        OrderCarDTO orderCarDTO = new OrderCarDTO();
        orderCarDTO.setOrder(dto.getOrder());
        orderCarDTO.setCar(dto.getCar());
        return ResponseEntity.ok(orderCarDTO);
    }

    @Override
    public Order findByEmail(String email) {
        return orderMapper.toENTITY(orderRepo.findByEmail(email));
    }
}