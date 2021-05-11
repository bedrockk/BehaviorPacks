package com.bedrockk.packs.definition;

import com.bedrockk.packs.type.FilterOperator;
import com.bedrockk.packs.type.FilterTarget;
import lombok.Data;

import java.util.List;

@Data
public class EntityFilterDefinition implements Definition {
	private List<EntityFilterDefinition> allOf;
	private List<EntityFilterDefinition> anyOf;
	private List<EntityFilterDefinition> noneOf;

	private String test;
	private String domain;
	private FilterOperator operator = FilterOperator.EQUALS;
	private FilterTarget subject = FilterTarget.SELF;
	private Object value;
	private String otherWithFamilies;
}