package ru.dexsys.mapstructdemo.mapper;

import org.mapstruct.EnumMapping;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import ru.dexsys.mapstructdemo.dto.GoodTypeDto;
import ru.dexsys.mapstructdemo.entity.GoodType;

@Mapper(componentModel = "spring")
public interface GoodTypeMapper {
    @InheritInverseConfiguration
    GoodType apply(GoodTypeDto goodTypeDto);

    @EnumMapping(nameTransformationStrategy = "suffix",
            configuration = "_TYPE",
            unexpectedValueMappingException = RuntimeException.class)
    GoodTypeDto apply(GoodType goodTypeDto);
}
