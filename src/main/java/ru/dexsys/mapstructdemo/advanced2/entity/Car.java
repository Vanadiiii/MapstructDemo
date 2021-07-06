package ru.dexsys.mapstructdemo.advanced2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class Car {
    private UUID id;
    private String regNumber;
    private String phone;
    private Model model;
}
