package com.bedrockk.packs.definition.entity;

import lombok.Data;

@Data
public class PhysicsDefinition implements EntityComponentDefinition {

	private boolean hasCollision = true;
	private boolean hasGravity = true;
}