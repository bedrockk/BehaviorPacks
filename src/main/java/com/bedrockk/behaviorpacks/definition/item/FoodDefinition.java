package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import com.bedrockk.behaviorpacks.node.PackNode;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Data
@JsonSince("1.16.100") // TODO: implement converter
public class FoodDefinition implements ItemComponentNode {
	private ItemEventTriggerDefinition onConsume;
	private int nutrition;
	private SaturationModifier saturationModifier;
	private String usingConvertsTo;
	private boolean canAlwaysEat = false;

	public enum SaturationModifier {
		LOW,
		NORMAL,
		POOR,
		GOOD,
		SUPERNATURAL;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
