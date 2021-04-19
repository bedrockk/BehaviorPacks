package com.bedrockk.behaviorpacks.description.property;

import lombok.Data;

import java.util.List;

@Data
public class FlyingSpeedDescription implements PropertyDescription {
    private double value = 0.02;
}
