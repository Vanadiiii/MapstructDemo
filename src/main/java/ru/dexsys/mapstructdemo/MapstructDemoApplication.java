package ru.dexsys.mapstructdemo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.dexsys.mapstructdemo.advanced2.dto.CarDto;
import ru.dexsys.mapstructdemo.advanced2.entity.Car;
import ru.dexsys.mapstructdemo.advanced2.mapper.CarMapper;

import java.util.UUID;

@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class MapstructDemoApplication implements CommandLineRunner {
    private final CarMapper carMapper;

    public static void main(String[] args) {
        SpringApplication.run(MapstructDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        CarDto carDto = CarDto.builder()
                .id(UUID.randomUUID())
                .model("AUDI")
                .ownerPhone("89127684213")
                .type("really_cool")
                .build();

        log.warn(carDto.toString());

        Car car = carMapper.apply(carDto);
        log.warn(car.toString());

    }
}
