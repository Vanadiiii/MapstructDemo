package ru.dexsys.mapstructdemo.advanced3.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Turtle extends Animal {
    private String shell;
    private boolean sea;

    public Turtle() {
        this.setMammal(false);
    }
}
