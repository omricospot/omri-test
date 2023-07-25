package org.example.models.configs;

public class BlGroupDockerSwarmConfigAutoScaler {
    //region Members
    private BlGroupDockerSwarmConfigAutoScalerScaleDown scaleDown;
    private BlGroupDockerSwarmResourcesConfig           defaultResources;
    //endregion

    //region Getter and Setter methods

    public BlGroupDockerSwarmConfigAutoScalerScaleDown getScaleDown() {
        return scaleDown;
    }

    public void setScaleDown(BlGroupDockerSwarmConfigAutoScalerScaleDown scaleDown) {
        this.scaleDown = scaleDown;
    }

    public BlGroupDockerSwarmResourcesConfig getDefaultResources() {
        return defaultResources;
    }

    public void setDefaultResources(BlGroupDockerSwarmResourcesConfig defaultResources) {
        this.defaultResources = defaultResources;
    }

    //endregion
}
