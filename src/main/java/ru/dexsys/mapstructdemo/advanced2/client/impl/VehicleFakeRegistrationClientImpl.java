package ru.dexsys.mapstructdemo.advanced2.client.impl;

import org.springframework.stereotype.Component;
import ru.dexsys.mapstructdemo.advanced2.client.VehicleRegistrationClient;

import java.util.UUID;

@Component
public class VehicleFakeRegistrationClientImpl implements VehicleRegistrationClient {
    public String getRegNumber(UUID id) {
        return new StringBuilder(id.toString())
                .reverse()
                .substring(0, 5)
                .toUpperCase();
    }
}
