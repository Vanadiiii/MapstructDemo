package ru.dexsys.mapstructdemo.advanced1.mapper;

import org.mapstruct.Mapper;
import ru.dexsys.mapstructdemo.advanced1.dto.MotorbikeDto;
import ru.dexsys.mapstructdemo.advanced1.entity.motobike.BikeType;
import ru.dexsys.mapstructdemo.advanced1.entity.motobike.Motorbike;
import ru.dexsys.mapstructdemo.advanced1.factory.BikeFactory;

@Mapper(componentModel = "spring", uses = BikeFactory.class)
public interface BikeMapper {
    Motorbike createMotorbike(BikeType type, MotorbikeDto motorbikeDto);
}
