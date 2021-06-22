package ru.dexsys.mapstructdemo.advanced1.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Track extends Car {
    private String engine;
}
