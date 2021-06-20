package ru.dexsys.mapstructdemo.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.mockito.Spy;
import ru.dexsys.mapstructdemo.dto.AddressDto;
import ru.dexsys.mapstructdemo.dto.OrderDto;
import ru.dexsys.mapstructdemo.entity.Order;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class OrderMapperTest {

    @Spy
    private final OrderMapper orderMapper = Mappers.getMapper(OrderMapper.class);

    private OrderDto orderDto;

    @BeforeEach
    private void initOrderDto() {
        AddressDto addressDto = new AddressDto();
        addressDto.setStreet("Udmurtskaya");
        addressDto.setCity("Izhevsk");
        addressDto.setHouseNumber("304");

        orderDto = new OrderDto();
        orderDto.setOrderId(UUID.randomUUID().toString());
        orderDto.setClientName("Boris"); // 'the blade'
        orderDto.setClientSurname("Yurinov");
        orderDto.setClientAddress(addressDto);
    }

    @Test
    void orderMapperTest() {
        Order order = orderMapper.apply(orderDto);

        log.info(orderDto.toString());
        log.info(order.toString());

        assertEquals(
                orderDto.getClientSurname() + " " + orderDto.getClientName(),
                order.getClient()
        );
        assertEquals(orderDto.getOrderId(), order.getId().toString());
        assertEquals(orderDto.getClientAddress().getCity(), order.getClientAddress().getCity());
        assertEquals(orderDto.getClientAddress().getStreet(), order.getClientAddress().getStreet());
        assertEquals(orderDto.getClientAddress().getHouseNumber(), order.getClientAddress().getHouseNumber());
    }
}
