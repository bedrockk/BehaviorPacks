package com.bedrockk.behaviorpacks.description.property;

import lombok.Data;

import java.util.List;

@Data
public class ItemControllableDescription implements PropertyDescription {
    private List<String> controlItems;
}
