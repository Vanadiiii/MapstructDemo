package ru.dexsys.mapstructdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.dexsys.mapstructdemo.mapper.AddressMapper;

@SpringBootApplication
@RequiredArgsConstructor
public class MapstructDemoApplication implements CommandLineRunner {
    private final AddressMapper addressMapper;

    public static void main(String[] args) {
        SpringApplication.run(MapstructDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
