package ru.dexsys.mapstructdemo.advanced2.mapper;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.dexsys.mapstructdemo.advanced2.dto.CarDto;
import ru.dexsys.mapstructdemo.advanced2.entity.Car;

import java.util.function.Function;

@Mapper(componentModel = "spring")
@DecoratedWith(CarMapperDecorator.class)
public interface CarMapper extends Function<CarDto, Car> {

    @Mapping(target = "phone", source = "ownerPhone")
    @Mapping(target = "regNumber", ignore = true)
    Car apply(CarDto carDto);
}
