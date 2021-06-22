package ru.dexsys.mapstructdemo.advanced1.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public abstract class Car {
    protected String number;
    protected BigDecimal price;
}
