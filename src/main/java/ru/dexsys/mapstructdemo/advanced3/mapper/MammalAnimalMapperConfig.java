package ru.dexsys.mapstructdemo.advanced3.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import ru.dexsys.mapstructdemo.advanced3.dto.MammalAnimalDto;
import ru.dexsys.mapstructdemo.advanced3.entity.MammalAnimal;

@MapperConfig(componentModel = "spring")
public interface MammalAnimalMapperConfig extends AnimalMapperConfig {

    @InheritConfiguration
    @Mapping(target = "hair", source = "breed")
    MammalAnimal mapMammal(MammalAnimalDto mammalAnimalDto);
}
