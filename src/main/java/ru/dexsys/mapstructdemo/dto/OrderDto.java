package ru.dexsys.mapstructdemo.dto;

import lombok.Data;
import org.mapstruct.Named;

@Data
public class OrderDto {
    private String orderId;

    private String clientName;
    private String clientSurname;
    private AddressDto clientAddress;
}
