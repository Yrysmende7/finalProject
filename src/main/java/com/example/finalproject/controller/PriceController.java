package com.example.finalproject.controller;

import com.example.finalproject.models.Price;
import com.example.finalproject.models.dto.PriceDTO;
import com.example.finalproject.service.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/price")
@RequiredArgsConstructor
public class PriceController {
    private final PriceService priceService;
    @PostMapping("/save")
    public PriceDTO save(@RequestBody Price price){
        return priceService.save(price);
    }
}
