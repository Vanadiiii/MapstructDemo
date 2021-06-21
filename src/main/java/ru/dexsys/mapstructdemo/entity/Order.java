package ru.dexsys.mapstructdemo.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Order {
    private UUID id;
    private UUID goodId;
    private LocalDateTime dateTime;
    private BigDecimal price;

    private String client;
    private Address clientAddress;
}
