package com.example.finalproject.mappers;

import com.example.finalproject.models.Price;
import com.example.finalproject.models.dto.PriceDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PriceMapper {
    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);
    PriceDTO toDto (Price price);
    Price toEntity (PriceDTO priceDTO);
}
