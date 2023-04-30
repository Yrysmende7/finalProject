package com.example.finalproject.models.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PriceDTO {
    Double price;
    LocalDateTime startDate;
    LocalDateTime endDate;
}
