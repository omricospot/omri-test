package org.example.models;

import java.util.List;

/**
 * <pre>example:
 * {
 *  "thresholdUnhealthyNotificationPercentage": 50,
 *  "excludedHealthChecksForInstanceHealthiness" [ELB, TARGET_GROUP]
 * }</pre>
 */
public class BlGroupHealthCheckConfig {
    //region Members

    /**
     * <pre>The threshold to consider the group as unhealthy.
     *  default: 30
     *  range: 0 - 100</pre>
     */
    private Float                     thresholdUnhealthyNotificationPercentage;

    /**
     * HealthCheck types to exclude when checking the group healthiness.
     */
    private List<HealthCheckTypeEnum> excludedHealthChecksForInstanceHealthiness;
    //endregion
}
