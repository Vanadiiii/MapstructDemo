package ru.dexsys.mapstructdemo.dto;

import lombok.Data;

@Data
public class AddressDto {
    private String city;
    private String street;
    private String houseNumber;
}
