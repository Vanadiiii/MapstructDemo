package ru.dexsys.mapstructdemo.mapper;

import org.mapstruct.*;
import ru.dexsys.mapstructdemo.dto.OrderDto;
import ru.dexsys.mapstructdemo.entity.Order;

import java.util.UUID;
import java.util.function.Function;

@Mapper(componentModel = "spring", imports = UUID.class)
public interface OrderMapper extends Function<OrderDto, Order> {
    @Override
    @Mapping(target = "id", expression = "java(UUID.randomUUID())")
    @Mapping(target = "client", source = "clientSurname", qualifiedByName = "getCoolName")
    Order apply(OrderDto orderDto);


    @Named("getCoolName")
    default String getCoolName(String clientSurname) {
        return "mr." + clientSurname;
    }
}
