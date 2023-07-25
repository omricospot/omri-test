package org.example.models;

/**
 * @author oleksandr_v
 * @since 17/02/2021
 */
public class BlGroupInternalPredictiveScalingConfig {
    //region Members
    private Boolean enableMlPredictiveScaling;
    //endregion

    //region Getters & Setters
    public Boolean getEnableMlPredictiveScaling() {
        return enableMlPredictiveScaling;
    }

    public void setEnableMlPredictiveScaling(Boolean enableMlPredictiveScaling) {
        this.enableMlPredictiveScaling = enableMlPredictiveScaling;
    }
    //endregion
}
