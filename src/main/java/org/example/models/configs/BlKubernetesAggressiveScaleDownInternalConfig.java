package org.example.models.configs;

public class BlKubernetesAggressiveScaleDownInternalConfig {
    //region Members
    private Boolean isEnabled;
    private Boolean skipCordon;
    //endregion

    //region Getter and Setter methods
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Boolean getSkipCordon() {
        return skipCordon;
    }

    public void setSkipCordon(Boolean skipCordon) {
        this.skipCordon = skipCordon;
    }
    //endregion
}
