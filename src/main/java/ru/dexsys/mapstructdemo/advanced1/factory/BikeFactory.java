package ru.dexsys.mapstructdemo.advanced1.factory;

import org.mapstruct.ObjectFactory;
import org.springframework.stereotype.Component;
import ru.dexsys.mapstructdemo.advanced1.entity.motobike.BikeType;
import ru.dexsys.mapstructdemo.advanced1.entity.motobike.Motorbike;
import ru.dexsys.mapstructdemo.advanced1.entity.motobike.SportBike;
import ru.dexsys.mapstructdemo.advanced1.entity.motobike.StandardBike;

@Component
public class BikeFactory {

    @ObjectFactory
    public Motorbike getByType(BikeType type) {
        switch (type) {
            case SPORT:
                return SportBike.newBike();
            case STANDARD:
                return StandardBike.newBike();
            default:
                throw new RuntimeException("Unknown type of bike");
        }
    }
}
