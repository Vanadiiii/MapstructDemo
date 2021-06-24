package ru.dexsys.mapstructdemo.advanced1.factory;

import org.mapstruct.ObjectFactory;
import org.springframework.stereotype.Component;
import ru.dexsys.mapstructdemo.advanced1.dto.CarDto;

@Component
public class CarDtoFactory {
    @ObjectFactory
    public CarDto createCarDto() {
        return CarDto.getCarDto();
    }
}
