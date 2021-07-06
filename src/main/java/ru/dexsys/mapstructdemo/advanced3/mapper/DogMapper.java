package ru.dexsys.mapstructdemo.advanced3.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import ru.dexsys.mapstructdemo.advanced3.dto.DogDto;
import ru.dexsys.mapstructdemo.advanced3.entity.Dog;

@Mapper(config = MammalAnimalMapperConfig.class)
public interface DogMapper {

    @InheritConfiguration(name = "mapMammal")
    Dog apply(DogDto dogDto);
}
