package ru.dexsys.mapstructdemo.advanced3.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public abstract class MammalAnimalDto extends AnimalDto {
    private String hairColor;

    protected MammalAnimalDto() {
        this.setMammal(true);
    }
}
