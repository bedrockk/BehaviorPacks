package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.definition.entity.EntityEventTriggerDefinition;
import lombok.Data;

@Data
public class LayEggGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double goalRadius = 0.5;
	private EntityEventTriggerDefinition onLay;
	private int searchHeight = 1;
	private int searchRange = 0;
	private double speedMultiplier = 1.0;
}