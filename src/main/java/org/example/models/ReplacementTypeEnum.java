package org.example.models;


/**
 * Created by roeimishori on 09/11/2017.
 */
public enum ReplacementTypeEnum {
    STANDARD("STANDARD"),
    DETACH_FIRST("DETACH_FIRST");

    private String name;

    ReplacementTypeEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    }

