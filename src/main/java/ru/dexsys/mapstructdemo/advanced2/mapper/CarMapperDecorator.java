package ru.dexsys.mapstructdemo.advanced2.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import ru.dexsys.mapstructdemo.advanced2.client.VehicleRegistrationClient;
import ru.dexsys.mapstructdemo.advanced2.dto.CarDto;
import ru.dexsys.mapstructdemo.advanced2.entity.Car;

public class CarMapperDecorator implements CarMapper {
    @Autowired
    private CarMapper delegate;
    @Autowired
    private VehicleRegistrationClient regClient;

    @Override
    public Car apply(CarDto carDto) {
        Car car = delegate.apply(carDto);
        return car.toBuilder()
                .regNumber(regClient.getRegNumber(car.getId()))
                .build();
    }
}
