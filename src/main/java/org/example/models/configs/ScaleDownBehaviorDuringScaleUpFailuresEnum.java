package org.example.models.configs;



public enum ScaleDownBehaviorDuringScaleUpFailuresEnum {

    //region Enums
    DISABLE("disable"),
    ENABLE("enable");
    //endregion

    //region Members
    private              String name;
    //endregion

    //region Constructors
    ScaleDownBehaviorDuringScaleUpFailuresEnum(String name) {
        this.name = name;
    }
    //endregion

    //region Getters & Setters
    public String getName() {
        return name;
    }
    //endregion

}
