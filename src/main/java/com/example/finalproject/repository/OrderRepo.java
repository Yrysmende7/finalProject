package com.example.finalproject.repository;

import com.example.finalproject.models.Order;
import com.example.finalproject.models.dto.OrderDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderRepo extends JpaRepository<Order,Long> {
    OrderDTO findByEmail(String email);
}
