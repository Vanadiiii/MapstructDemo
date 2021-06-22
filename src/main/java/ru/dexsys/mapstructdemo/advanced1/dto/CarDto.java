package ru.dexsys.mapstructdemo.advanced1.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class CarDto {
    private String number;
    private BigDecimal price;

    public static CarDto getCarDto() {
        return new CarDto("R336EN", BigDecimal.valueOf(1_200_000.00D));
    }
}
