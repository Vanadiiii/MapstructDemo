package ru.dexsys.mapstructdemo.advanced3.mapper;

import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import ru.dexsys.mapstructdemo.advanced3.dto.AnimalDto;
import ru.dexsys.mapstructdemo.advanced3.entity.Animal;

@MapperConfig(componentModel = "spring")
public interface AnimalMapperConfig {

    @Mapping(source = "age", target = "yearsOld")
    @Mapping(source = "breed", target = "kind")
    Animal mapAnimal(AnimalDto animalDto);
}
