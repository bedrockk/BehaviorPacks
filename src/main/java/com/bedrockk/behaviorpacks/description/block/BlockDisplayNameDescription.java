package com.bedrockk.behaviorpacks.description.block;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.description.BlockDescription;
import com.bedrockk.behaviorpacks.node.SingleValueNode;

@JsonSince("1.16.100")
public class BlockDisplayNameDescription extends SingleValueNode<String> implements BlockDescription {
    public BlockDisplayNameDescription(String value) {
        super(value);
    }
}