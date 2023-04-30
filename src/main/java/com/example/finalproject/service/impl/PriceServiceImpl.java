package com.example.finalproject.service.impl;

import com.example.finalproject.mappers.PriceMapper;
import com.example.finalproject.models.Price;
import com.example.finalproject.models.dto.PriceDTO;
import com.example.finalproject.repository.PriceRepo;
import com.example.finalproject.service.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class PriceServiceImpl implements PriceService {
    private final PriceMapper priceMapper;
    private final PriceRepo priceRepo;
    @Override
    public PriceDTO save(Price price) {
        return priceMapper.toDto(priceRepo.save(price));
    }
}
