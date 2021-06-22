package ru.dexsys.mapstructdemo.advanced1.factory;

import org.mapstruct.TargetType;
import ru.dexsys.mapstructdemo.advanced1.entity.Car;
import ru.dexsys.mapstructdemo.advanced1.entity.RacingCar;
import ru.dexsys.mapstructdemo.advanced1.entity.Sedan;
import ru.dexsys.mapstructdemo.advanced1.entity.Track;

public class CarFactory {

    //method, which params annotated by @TargetType and returns required type
    public <T extends Car> Car createCar(@TargetType Class<T> carClass) {
        if (RacingCar.class.equals(carClass)) {
            return new RacingCar();
        } else if (Track.class.equals(carClass)) {
            return new Track();
        } else if (Sedan.class.equals(carClass)) {
            return new Sedan();
        } else {
            throw new RuntimeException("unmapped car type - " + carClass.getName());
        }
    }
}
