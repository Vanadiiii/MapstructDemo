package ru.dexsys.mapstructdemo.simple.dto;

import lombok.Data;

@Data
public class AddressDto {
    private String cityName;
    private String streetName;
    private String houseNumber;
}