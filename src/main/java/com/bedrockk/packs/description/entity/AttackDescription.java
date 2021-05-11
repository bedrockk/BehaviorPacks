package com.bedrockk.packs.description.entity;

import com.bedrockk.packs.description.EntityDescription;
import com.bedrockk.packs.type.EffectType;
import lombok.Data;

@Data
public class AttackDescription implements EntityDescription {
	private double damage;
	private double effectDuration = 0.0;
	private EffectType effectName;
}