package ru.dexsys.mapstructdemo.advanced3.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Dog extends MammalAnimal {
    private boolean fighting;
}
