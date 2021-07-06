package ru.dexsys.mapstructdemo.advanced3.entity;

import lombok.Data;

@Data
public abstract class Animal {
    private String name;
    private int yearsOld;
    private String kind; //порода
    private boolean mammal;
}
