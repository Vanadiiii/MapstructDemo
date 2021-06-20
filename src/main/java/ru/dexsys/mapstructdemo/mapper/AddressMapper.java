package ru.dexsys.mapstructdemo.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.dexsys.mapstructdemo.dto.AddressDto;
import ru.dexsys.mapstructdemo.entity.Address;

import java.util.function.Function;

@Mapper(componentModel = "spring")
public interface AddressMapper extends Function<AddressDto, Address> {
    @Override
    @Mapping(target = "city", source = "cityName")
    @Mapping(target = "street", source = "streetName")
    Address apply(AddressDto addressDto);
}
