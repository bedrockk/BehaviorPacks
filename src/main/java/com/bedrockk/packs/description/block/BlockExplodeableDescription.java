package com.bedrockk.packs.description.block;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.annotation.JsonConverter;
import com.bedrockk.packs.description.BlockDescription;
import com.bedrockk.packs.json.VersionConverter;
import com.bedrockk.packs.node.SingleValueNode;
import com.bedrockk.packs.type.SemVersion;
import com.bedrockk.packs.utils.FormatVersions;
import com.fasterxml.jackson.databind.JsonNode;

@JsonConverter(current = BlockExplodeableDescription.Converter.class)
public class BlockExplodeableDescription extends SingleValueNode<Double> implements BlockDescription {
	public BlockExplodeableDescription(Double value) {
		super(value);
	}

	public static class Converter extends VersionConverter<BlockExplodeableDescription> {

		@Override
		public boolean isValid(SemVersion version) {
			return version.isLower(FormatVersions.V1_16_0);
		}

		@Override
		public JsonNode apply(JsonNode value) {
			return value.isDouble() ? value.get("value") : value;
		}
	}
}
