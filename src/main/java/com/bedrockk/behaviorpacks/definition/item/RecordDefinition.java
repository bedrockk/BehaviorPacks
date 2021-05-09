package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import com.bedrockk.behaviorpacks.type.SlotType;
import lombok.Data;

@Data
@JsonSince("1.16.100")
public class RecordDefinition implements ItemComponentNode {
	private String soundEvent;
	private int duration;
	private int comparatorSignal;
}
