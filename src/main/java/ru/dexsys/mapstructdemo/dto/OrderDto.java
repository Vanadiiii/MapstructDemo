package ru.dexsys.mapstructdemo.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderDto {
    private String orderId;
    private String orderDateTime;
    private String price;

    private String clientName;
    private String clientSurname;
    private AddressDto clientAddress;

    private OrderTypeDto orderTypeDto;
    private GoodTypeDto goodTypeDto;

    private final List<String> comments;
}
