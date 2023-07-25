package org.example.models.configs;

public class BlScheduledPreventiveReplacementConfig {
    //region Members
    private Boolean isEnabled;
    private Integer averageIntervalMinutes;
    private Integer coolDownMinutes;
    private Integer maxInstancesToReplace;
    //endregion

    //region Getters & Setters
    public Boolean getEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }

    public Integer getAverageIntervalMinutes() {
        return averageIntervalMinutes;
    }

    public void setAverageIntervalMinutes(Integer averageIntervalMinutes) {
        this.averageIntervalMinutes = averageIntervalMinutes;
    }

    public Integer getCoolDownMinutes() {
        return coolDownMinutes;
    }

    public void setCoolDownMinutes(Integer coolDownConfig) {
        this.coolDownMinutes = coolDownConfig;
    }

    public Integer getMaxInstancesToReplace() {
        return maxInstancesToReplace;
    }

    public void setMaxInstancesToReplace(Integer maxInstancesToReplace) {
        this.maxInstancesToReplace = maxInstancesToReplace;
    }
    //endregion
}