package ru.dexsys.mapstructdemo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;
import ru.dexsys.mapstructdemo.dto.OrderTypeDto;
import ru.dexsys.mapstructdemo.entity.OrderType;

import java.util.function.Function;

@Mapper(componentModel = "spring")
public interface OrderTypeMapper extends Function<OrderTypeDto, OrderType> {
    @Override
    @ValueMapping(target = "DELIVERY", source = "DELIVERY")
    @ValueMapping(target = "POST_OFFICE", source = "POST")
    @ValueMapping(target = "SELF_DISPOSAL", source = "PICKUP")
    @ValueMapping(target = MappingConstants.NULL, source = "SPECIAL")
    OrderType apply(OrderTypeDto orderTypeDto);
}
