package org.example.models.configs;

/**
 * Created by talzur on 06/11/2016.
 */
public class BlKubernetesInternalConfig {
    //region Members
    private BlKubernetesAutoScalerInternalConfig autoScaler;
    //endregion

    //region Getter and Setter methods

    public BlKubernetesAutoScalerInternalConfig getAutoScaler() {
        return autoScaler;
    }

    public void setAutoScaler(BlKubernetesAutoScalerInternalConfig autoScaler) {
        this.autoScaler = autoScaler;
    }
    //endregion

    //region Override Methods
    @Override
    public String toString() {
        return "BlKubernetesInternalConfig{" + "autoScaler=" + autoScaler + '}';
    }
    //endregion
}
