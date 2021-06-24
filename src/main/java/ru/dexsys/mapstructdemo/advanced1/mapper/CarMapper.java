package ru.dexsys.mapstructdemo.advanced1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.dexsys.mapstructdemo.advanced1.dto.CarDto;
import ru.dexsys.mapstructdemo.advanced1.entity.car.Car;
import ru.dexsys.mapstructdemo.advanced1.entity.car.RacingCar;
import ru.dexsys.mapstructdemo.advanced1.entity.car.Sedan;
import ru.dexsys.mapstructdemo.advanced1.entity.car.Track;
import ru.dexsys.mapstructdemo.advanced1.factory.CarDtoFactory;
import ru.dexsys.mapstructdemo.advanced1.factory.CarFactory;

@Mapper(componentModel = "spring", uses = {CarDtoFactory.class, CarFactory.class})
public interface CarMapper {
    CarDto carToCarDto(Car car);

    RacingCar carDtoToRacingCar(CarDto carDto);

    Sedan carDtoToSedan(CarDto carDto);

    @Mapping(target = "engine", constant = "diesel")
    Track carDtoToTrack(CarDto carDto);
}
