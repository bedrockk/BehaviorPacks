package com.bedrockk.packs.definition.loot.function;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.definition.loot.LootTableFunction;
import com.bedrockk.packs.node.PackNode;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.StdConverter;
import lombok.Data;

import java.util.List;

@Data
@JsonDeserialize(converter = SetBannerDetailsFunction.Converter.class)
public class SetBannerDetailsFunction implements LootTableFunction {
	private String type; // default or illager_captain
	private String baseColor;
	private List<Pattern> patterns;

	@Data
	public static class Pattern implements PackNode {
		private String pattern;
		private String color;
	}

	public static class Converter extends StdConverter<ObjectNode, ObjectNode> {
		@Override
		public ObjectNode convert(ObjectNode value) {
			if (value.has("type")) {
				JsonNode type = value.get("type");
				if (type.isObject() && type.has("min") && type.has("max")) {
					value.set("type", PackHelper.toJsonNode("default"));
				}
			}
			return value;
		}
	}
}