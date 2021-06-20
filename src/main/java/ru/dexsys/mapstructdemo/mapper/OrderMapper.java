package ru.dexsys.mapstructdemo.mapper;

import org.mapstruct.*;
import ru.dexsys.mapstructdemo.dto.OrderDto;
import ru.dexsys.mapstructdemo.entity.Order;
import ru.dexsys.mapstructdemo.mapper.qualifier.OrderIdQualifier;

import java.util.UUID;
import java.util.function.Function;

@Mapper(componentModel = "spring", imports = UUID.class, uses = AddressMapper.class)
public interface OrderMapper extends Function<OrderDto, Order> {
    @Override
    @Mapping(target = "id", source = "orderId", qualifiedBy = OrderIdQualifier.class)
    Order apply(OrderDto orderDto);

    @AfterMapping
    default void setFullName(@MappingTarget Order order, OrderDto orderDto) {
        order.setClient(
                orderDto.getClientSurname() + " " + orderDto.getClientName()
        );
    }

    @OrderIdQualifier
    default UUID fromString(String orderId) {
        return UUID.fromString(orderId);
    }
}
