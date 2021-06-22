package ru.dexsys.mapstructdemo.simple.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.mockito.Spy;
import org.springframework.test.util.ReflectionTestUtils;
import ru.dexsys.mapstructdemo.simple.dto.AddressDto;
import ru.dexsys.mapstructdemo.simple.dto.OrderDto;
import ru.dexsys.mapstructdemo.simple.entity.Order;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class OrderMapperTest {
    @Spy
    private final OrderMapper orderMapper = Mappers.getMapper(OrderMapper.class);
    @Spy
    private final AddressMapper addressMapper = Mappers.getMapper(AddressMapper.class);

    private OrderDto orderDto;

    @BeforeEach
    private void injectDependencies() {
        ReflectionTestUtils.setField(orderMapper, "addressMapper", addressMapper);
    }

    @BeforeEach
    private void initOrderDto() {
        AddressDto addressDto = new AddressDto();
        addressDto.setStreetName("Udmurtskaya");
        addressDto.setCityName("Izhevsk");
        addressDto.setHouseNumber("304");

        orderDto = new OrderDto();
        orderDto.setOrderId(UUID.randomUUID().toString());
        orderDto.setClientName("Boris"); // 'the blade'
        orderDto.setClientSurname("Yurinov");
        orderDto.setOrderDateTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")));
        orderDto.setClientAddress(addressDto);
        orderDto.setPrice("$2345.22");
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
        assertEquals(orderDto.getClientAddress().getCityName(), order.getClientAddress().getCity());
        assertEquals(orderDto.getClientAddress().getStreetName(), order.getClientAddress().getStreet());
        assertEquals(orderDto.getClientAddress().getHouseNumber(), order.getClientAddress().getHouseNumber());
        assertEquals(
                LocalDateTime.parse(orderDto.getOrderDateTime(), DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")),
                order.getDateTime()
        );
        assertEquals(order.getPrice(), new BigDecimal(orderDto.getPrice().replace("$", "")));
    }
}
