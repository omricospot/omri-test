package org.example.models;

import java.util.List;

/**
 * Created by talzur on 06/11/2016.
 */
public class BlGroupHealthCheckConfig {
    //region Members
    private Float                     thresholdUnhealthyNotificationPercentage;
    private List<HealthCheckTypeEnum> excludedHealthChecksForInstanceHealthiness;
    //endregion

    //region Getter and Setter methods

    public List<HealthCheckTypeEnum> getExcludedHealthChecksForInstanceHealthiness() {
        return excludedHealthChecksForInstanceHealthiness;
    }

    public void setExcludedHealthChecksForInstanceHealthiness(
            List<HealthCheckTypeEnum> excludedHealthChecksForInstanceHealthiness) {
        this.excludedHealthChecksForInstanceHealthiness = excludedHealthChecksForInstanceHealthiness;
    }

    public Float getThresholdUnhealthyNotificationPercentage() {
        return thresholdUnhealthyNotificationPercentage;
    }

    public void setThresholdUnhealthyNotificationPercentage(Float thresholdUnhealthyNotificationPercentage) {
        this.thresholdUnhealthyNotificationPercentage = thresholdUnhealthyNotificationPercentage;
    }

    //endregion
}
