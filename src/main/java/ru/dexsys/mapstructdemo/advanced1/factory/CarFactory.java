package ru.dexsys.mapstructdemo.advanced1.factory;

import org.mapstruct.TargetType;
import org.springframework.stereotype.Component;
import ru.dexsys.mapstructdemo.advanced1.entity.car.Car;
import ru.dexsys.mapstructdemo.advanced1.entity.car.RacingCar;
import ru.dexsys.mapstructdemo.advanced1.entity.car.Sedan;
import ru.dexsys.mapstructdemo.advanced1.entity.car.Track;

@Component
public class CarFactory {

    public <T extends Car> T createCar(@TargetType Class<T> carClass) {
        if (RacingCar.class.equals(carClass)) {
            return (T) RacingCar.of();
        } else if (Track.class.equals(carClass)) {
            return (T) Track.of();
        } else if (Sedan.class.equals(carClass)) {
            return (T) Sedan.of();
        } else {
            throw new RuntimeException("unmapped car type - " + carClass.getName());
        }
    }
}
