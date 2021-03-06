package ru.dexsys.mapstructdemo.advanced3.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingInheritanceStrategy;
import ru.dexsys.mapstructdemo.advanced3.dto.CatDto;
import ru.dexsys.mapstructdemo.advanced3.entity.Cat;

@Mapper(config = MammalAnimalMapperConfig.class,
        mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface CatMapper {

    @InheritConfiguration(name = "mapMammal")
    @Mapping(source = "tailLong", target = "tailLength")
    Cat apply(CatDto catDto);
}
