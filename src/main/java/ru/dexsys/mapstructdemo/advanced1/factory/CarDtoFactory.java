package ru.dexsys.mapstructdemo.advanced1.factory;

import org.mapstruct.ObjectFactory;
import ru.dexsys.mapstructdemo.advanced1.dto.CarDto;

public class CarDtoFactory {

    //method without params
    @ObjectFactory //unused; just for example
    public CarDto createCarDto() {
        return CarDto.getCarDto();
    }
}
