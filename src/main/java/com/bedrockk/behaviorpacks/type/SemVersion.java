package com.bedrockk.behaviorpacks.type;

import com.bedrockk.behaviorpacks.BehaviorPackFactory;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class SemVersion implements Comparable<SemVersion> {
    private int major;
    private int minor;
    private int revision;
    private boolean isString = false;

    @JsonCreator
    public static SemVersion of(String version) {
        SemVersion v = of(Arrays.stream(version.split("\\.")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList()));
        v.setString(true);
        return v;
    }

    @JsonCreator
    public static SemVersion of(List<Integer> parts) {
        SemVersion version = new SemVersion();
        version.setMajor(parts.get(0));
        version.setMinor(parts.size() > 1 ? parts.get(1) : 0);
        version.setRevision(parts.size() > 2 ? parts.get(2) : 0);

        return version;
    }

    @JsonValue
    public JsonNode toJson() {
        if (!isString) {
            return BehaviorPackFactory.toJsonNode(Arrays.asList(major, minor, revision));
        } else {
            return BehaviorPackFactory.toJsonNode(toString());
        }
    }

    public String toString() {
        return getMajor() + "." + getMinor() + "." + getRevision();
    }

    @Override
    public int compareTo(SemVersion o) {
        if (o == this) {
            return 0;
        }

        if (getMajor() > o.getMajor()) {
            return 1;
        } else if (getMajor() == o.getMajor() && getMinor() > o.getMinor()) {
            return 1;
        } else if (getMajor() == o.getMajor() && getMinor() == o.getMinor() && getRevision() > o.getRevision()) {
            return 1;
        } else if (getMajor() == o.getMajor() && getMinor() == o.getMinor() && getRevision() == o.getRevision()) {
            return 0;
        }

        return -1;
    }
}
