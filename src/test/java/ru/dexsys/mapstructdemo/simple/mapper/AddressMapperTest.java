package ru.dexsys.mapstructdemo.simple.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.mockito.Spy;
import ru.dexsys.mapstructdemo.simple.dto.AddressDto;
import ru.dexsys.mapstructdemo.simple.entity.Address;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class AddressMapperTest {
    @Spy
    private final AddressMapper addressMapper = Mappers.getMapper(AddressMapper.class);

    private AddressDto addressDto;

    @BeforeEach
    void initAddressDto() {
        addressDto = new AddressDto();
        addressDto.setCityName("Izhevsk");
        addressDto.setStreetName("Udmurtskaya");
        addressDto.setHouseNumber("304");
    }

    @Test
    void applyTest() {
        Address address = addressMapper.apply(addressDto);

        log.info(addressDto.toString());
        log.info(address.toString());

        assertEquals(addressDto.getCityName(), address.getCity());
        assertEquals(addressDto.getStreetName(), address.getStreet());
        assertEquals(addressDto.getHouseNumber(), address.getHouseNumber());

    }
}