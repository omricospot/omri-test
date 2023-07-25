package org.example.models;

/**
 * @author - Roei Mishori
 **/
public class BlGroupNomadConfigAutoScaler {
    //region Members
    private BlGroupNomadConfigAutoScalerScaleDown scaleDown;
    private BlGroupNomadResourcesConfig           defaultResources;
    //endregion

    //region Getter and Setter methods

    public BlGroupNomadConfigAutoScalerScaleDown getScaleDown() {
        return scaleDown;
    }

    public void setScaleDown(BlGroupNomadConfigAutoScalerScaleDown scaleDown) {
        this.scaleDown = scaleDown;
    }

    public BlGroupNomadResourcesConfig getDefaultResources() {
        return defaultResources;
    }

    public void setDefaultResources(BlGroupNomadResourcesConfig defaultResources) {
        this.defaultResources = defaultResources;
    }

    //endregion
}
