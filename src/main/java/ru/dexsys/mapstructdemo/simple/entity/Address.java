package ru.dexsys.mapstructdemo.simple.entity;

import lombok.Data;

@Data
public class Address {
    private String city;
    private String street;
    private String houseNumber;
}