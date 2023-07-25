package org.example.models;

/**
 * Created by talzur on 06/11/2016.
 */
public class BlKubernetesResourcesInternalConfig {
    //region Members
    private Double cpu;
    private Double memory;
    //endregion

    //region Getter and Setter methods

    public Double getCpu() {
        return cpu;
    }

    public void setCpu(Double cpu) {
        this.cpu = cpu;
    }

    public Double getMemory() {
        return memory;
    }

    public void setMemory(Double memory) {
        this.memory = memory;
    }

    //endregion
}
