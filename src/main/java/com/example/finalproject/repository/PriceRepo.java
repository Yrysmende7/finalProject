package com.example.finalproject.repository;

import com.example.finalproject.models.Price;
import com.example.finalproject.models.dto.PriceDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  PriceRepo extends JpaRepository<Price, Long> {
}
