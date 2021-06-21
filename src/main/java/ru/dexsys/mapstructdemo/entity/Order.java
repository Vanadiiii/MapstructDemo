package ru.dexsys.mapstructdemo.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class Order {
    private UUID id;
    private UUID goodId;
    private LocalDateTime dateTime;
    private BigDecimal price;

    private String client;
    private Address clientAddress;

    @Setter(value = AccessLevel.NONE)
    private List<String> comments = new ArrayList<>();
}
