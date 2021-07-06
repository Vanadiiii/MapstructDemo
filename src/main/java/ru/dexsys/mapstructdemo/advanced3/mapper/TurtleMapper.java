package ru.dexsys.mapstructdemo.advanced3.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.dexsys.mapstructdemo.advanced3.dto.TurtleDto;
import ru.dexsys.mapstructdemo.advanced3.entity.Turtle;

@Mapper(config = AnimalMapperConfig.class)
public interface TurtleMapper {

    @InheritConfiguration
    @Mapping(source = "shellColor", target = "shell")
    @Mapping(target = "sea", expression = "java(!turtleDto.isLand())")
    Turtle apply(TurtleDto turtleDto);
}
