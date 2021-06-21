package ru.dexsys.mapstructdemo.mapper;

import org.mapstruct.*;
import ru.dexsys.mapstructdemo.dto.OrderDto;
import ru.dexsys.mapstructdemo.entity.Order;
import ru.dexsys.mapstructdemo.mapper.qualifier.OrderIdQualifier;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;

@Mapper(componentModel = "spring", imports = UUID.class,
        uses = AddressMapper.class,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface OrderMapper extends Function<OrderDto, Order> {
    @Override
    @Mapping(target = "id", source = "orderId", qualifiedBy = OrderIdQualifier.class)
    @Mapping(target = "dateTime", source = "orderDateTime", dateFormat = "yyyy-MM-dd'T'HH:mm:ss")
    Order apply(OrderDto orderDto);

    List<Order> applyToList(List<OrderDto> orderDtoList);

    Set<Order> applyToSet(List<OrderDto> orderDtoList);

    //for example: for case when key returns in format 'x-12'
    @MapMapping(keyNumberFormat = "x-#")
    Map<Integer, Order> applyToMap(Map<String, OrderDto> orderDtoMap);

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
