package ru.dexsys.mapstructdemo.advanced1.entity.car;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor(staticName = "of")
public class Track extends Car {
    private String engine;
}
