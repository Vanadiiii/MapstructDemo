package ru.dexsys.mapstructdemo.advanced1.entity.motobike;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Motorbike {
    private String number;
    private String price;
}
