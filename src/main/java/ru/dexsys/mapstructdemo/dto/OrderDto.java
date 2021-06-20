package ru.dexsys.mapstructdemo.dto;

import lombok.Data;

@Data
public class OrderDto {
    private String orderId;

    private String clientName;
    private String clientSurname;
    private AddressDto clientAddress;
}
