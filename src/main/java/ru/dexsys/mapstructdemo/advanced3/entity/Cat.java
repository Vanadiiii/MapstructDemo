package ru.dexsys.mapstructdemo.advanced3.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Cat extends MammalAnimal{
    private int tailLength;
}
