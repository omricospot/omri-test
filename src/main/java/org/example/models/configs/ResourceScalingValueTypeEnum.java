package org.example.models.configs;


/**
 * Created by Ben Izhak on 01/08/2022
 */
public enum ResourceScalingValueTypeEnum {
    //region Enums
    COUNT("count"),
    COST("cost"),
    VCPU("vCPU");
    //endregion

    //region Members
    private              String name;
    //endregion

    //region Constructors
    ResourceScalingValueTypeEnum(String name) {
        this.name = name;
    }
    //endregion

    //region Getters & Setters
    public String getName() {
        return name;
    }
    //endregion

}