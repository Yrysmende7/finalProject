package com.example.finalproject.controller;

import com.example.finalproject.models.Discount;
import com.example.finalproject.models.dto.DiscountDTO;
import com.example.finalproject.service.DiscountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discount")
@RequiredArgsConstructor
public class DiscountController {
    private final DiscountService discountService;
    @PostMapping("/save")
    public DiscountDTO save(@RequestBody Discount discount){
        return discountService.save(discount);
    }
}
