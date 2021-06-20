package ru.dexsys.mapstructdemo.entity;

import lombok.Data;

import java.util.UUID;

@Data
public class Order {
    private UUID id;
    private UUID goodId;
    private UUID clientId;

    private String client;
    private Address clientAddress;
}
