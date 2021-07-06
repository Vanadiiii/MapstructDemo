package ru.dexsys.mapstructdemo.advanced3.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DogDto extends MammalAnimalDto {
    private boolean fighting;
}
