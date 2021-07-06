package ru.dexsys.mapstructdemo.advanced3.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public abstract class MammalAnimal extends Animal {
    private String hair;

    public MammalAnimal() {
        this.setMammal(true);
    }
}
