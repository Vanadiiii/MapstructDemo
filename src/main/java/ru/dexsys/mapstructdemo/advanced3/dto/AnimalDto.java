package ru.dexsys.mapstructdemo.advanced3.dto;

import lombok.Data;

@Data
public abstract class AnimalDto {
    private String name;
    private int age;
    private String breed; //порода
    private boolean mammal;
}
