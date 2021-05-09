package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import lombok.Data;

@Data
@JsonSince("1.16.100")
public class ThrowableDefinition implements ItemComponentNode {
	private boolean doSwingAnimation;
	private int maxDrawDuration;
	private boolean scalePowerByDrawDuration;
	private double launchPowerScale;
}
