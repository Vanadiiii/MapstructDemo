package ru.dexsys.mapstructdemo.advanced2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {
    private UUID id;
    private String ownerPhone;
    private String model;
    private String type;
}
