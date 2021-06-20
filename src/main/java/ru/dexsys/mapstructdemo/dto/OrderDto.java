package ru.dexsys.mapstructdemo.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderDto {
    private String orderId;
    private String orderDateTime;

    private String clientName;
    private String clientSurname;
    private AddressDto clientAddress;
}
