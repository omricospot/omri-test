package org.example.models;

public class BlFixSpotDistributionConfig {
    //region Members
    private Boolean isEnabled;
    private Integer maxInstancesToReplace;
    //endregion

    //region Getters & Setters
    public Boolean getEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }

    public Integer getMaxInstancesToReplace() {
        return maxInstancesToReplace;
    }

    public void setMaxInstancesToReplace(Integer maxInstancesToReplace) {
        this.maxInstancesToReplace = maxInstancesToReplace;
    }
    //endregion
}