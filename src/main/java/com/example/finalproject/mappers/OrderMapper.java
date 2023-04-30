package com.example.finalproject.mappers;

import com.example.finalproject.models.Order;
import com.example.finalproject.models.dto.OrderDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
    OrderDTO toDTO (Order order);
    Order toENTITY (OrderDTO orderDTO);
}
