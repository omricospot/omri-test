package org.example.models;

public class BlNfuRiUtilizationConfig {
    //region Members
    private Integer minimalInstanceTypesCount;
    private Float   instanceTypesThreshold;
    //endregion

    //region Getters and Setters
    public Integer getMinimalInstanceTypesCount() {
        return minimalInstanceTypesCount;
    }

    public void setMinimalInstanceTypesCount(Integer minimalInstanceTypesCount) {
        this.minimalInstanceTypesCount = minimalInstanceTypesCount;
    }

    public Float getInstanceTypesThreshold() {
        return instanceTypesThreshold;
    }

    public void setInstanceTypesThreshold(Float instanceTypesThreshold) {
        this.instanceTypesThreshold = instanceTypesThreshold;
    }
    //endregion

    //region Override Methods

    @Override
    public String toString() {
        return "BlNfuRiUtilizationConfig{" + "minimalInstanceTypesCount=" + minimalInstanceTypesCount +
               ", instanceTypeThreshold=" + instanceTypesThreshold + '}';
    }
    //endregion

}
