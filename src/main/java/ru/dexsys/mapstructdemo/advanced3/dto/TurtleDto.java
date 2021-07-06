package ru.dexsys.mapstructdemo.advanced3.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class TurtleDto extends AnimalDto {
    private String shellColor;
    private boolean land;

    public TurtleDto() {
        this.setMammal(false);
    }
}
