package org.example.models.configs;

/**
 * @author - Roei Mishori
 **/
public class BlGroupNomadConfigAutoScalerScaleDown {
    //region Members
    private Integer utilizationThreshold;
    private Double  cooldownMultiplier;
    //endregion

    //region Getter and Setter methods
    public Integer getUtilizationThreshold() {
        return utilizationThreshold;
    }

    public void setUtilizationThreshold(Integer utilizationThreshold) {
        this.utilizationThreshold = utilizationThreshold;
    }

    public Double getCooldownMultiplier() {
        return cooldownMultiplier;
    }

    public void setCooldownMultiplier(Double cooldownMultiplier) {
        this.cooldownMultiplier = cooldownMultiplier;
    }

    //endregion
}
