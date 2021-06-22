package ru.dexsys.mapstructdemo.simple.mapper;

import org.mapstruct.*;
import ru.dexsys.mapstructdemo.simple.dto.OrderDto;
import ru.dexsys.mapstructdemo.simple.entity.Order;
import ru.dexsys.mapstructdemo.simple.mapper.qualifier.OrderIdQualifier;

import java.util.UUID;
import java.util.function.Function;

@Mapper(componentModel = "spring", imports = UUID.class,
        uses = {AddressMapper.class, OrderTypeMapper.class, GoodTypeMapper.class},
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface OrderMapper extends Function<OrderDto, Order> {
    @Override
    @Mapping(target = "goodId", ignore = true)
    @Mapping(target = "id", source = "orderId", qualifiedBy = OrderIdQualifier.class)
    @Mapping(target = "dateTime", source = "orderDateTime", dateFormat = "yyyy-MM-dd'T'HH:mm:ss")
    @Mapping(target = "orderType", source = "orderTypeDto")
    @Mapping(target = "goodType", source = "goodTypeDto")
    Order apply(OrderDto orderDto);

    @BeforeMapping
    default void removeDollarSign(OrderDto orderDto) {
        orderDto.setPrice(orderDto.getPrice().replace("$", ""));
    }

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
