package com.example.finalproject.service.impl;

import com.example.finalproject.mappers.DiscountMapper;
import com.example.finalproject.models.Discount;
import com.example.finalproject.models.dto.DiscountDTO;
import com.example.finalproject.repository.DiscountRepo;
import com.example.finalproject.service.DiscountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class DiscountServiceImpl implements DiscountService {
    private final DiscountMapper discountMapper;
    private final DiscountRepo discountRepo;
    @Override
    public DiscountDTO save(Discount discount) {
        return discountMapper.toDto(discountRepo.save(discount));
    }
}
