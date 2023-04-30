package com.example.finalproject.mappers;

import com.example.finalproject.models.Discount;
import com.example.finalproject.models.dto.DiscountDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DiscountMapper {
    DiscountMapper INSTANCE = Mappers.getMapper(DiscountMapper.class);
    DiscountDTO toDto (Discount discount);
    Discount toEntity (DiscountDTO discountDTO);
}
