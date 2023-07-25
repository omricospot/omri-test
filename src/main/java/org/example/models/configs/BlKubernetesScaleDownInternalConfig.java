package org.example.models.configs;


/**
 * Created by talzur on 06/11/2016.
 */
public class BlKubernetesScaleDownInternalConfig {
    //region Members
    private Integer                                       utilizationThreshold;
    private Integer                                       underUtilizedDuration;
    private Boolean                                       ignorePvcRestrictionsOnUnhealthyReplacements;
    private Boolean                                       ignorePvcRestrictionsOnReplacements;
    private Boolean                                       shouldScaleDownPvcNodes;
    private Boolean                                       shouldCordonBeforeScaleDown;
    private ScaleDownBehaviorDuringScaleUpFailuresEnum    scaleDownBehaviorDuringScaleUpFailures;
    private BlKubernetesAggressiveScaleDownInternalConfig aggressiveScaleDown;
    private Integer                                       maxMinutesToConsiderLatestCordonBatchForScaleDown;
    //endregion

    //region Getter and Setter methods
    public Integer getUtilizationThreshold() {
        return utilizationThreshold;
    }

    public void setUtilizationThreshold(Integer utilizationThreshold) {
        this.utilizationThreshold = utilizationThreshold;
    }

    public Integer getUnderUtilizedDuration() {
        return underUtilizedDuration;
    }

    public void setUnderUtilizedDuration(Integer underUtilizedDuration) {
        this.underUtilizedDuration = underUtilizedDuration;
    }

    public Boolean getIgnorePvcRestrictionsOnUnhealthyReplacements() {
        return ignorePvcRestrictionsOnUnhealthyReplacements;
    }

    public void setIgnorePvcRestrictionsOnUnhealthyReplacements(Boolean ignorePvcRestrictionsOnUnhealthyReplacements) {
        this.ignorePvcRestrictionsOnUnhealthyReplacements = ignorePvcRestrictionsOnUnhealthyReplacements;
    }

    public Boolean getIgnorePvcRestrictionsOnReplacements() {
        return ignorePvcRestrictionsOnReplacements;
    }

    public void setIgnorePvcRestrictionsOnReplacements(Boolean ignorePvcRestrictionsOnReplacements) {
        this.ignorePvcRestrictionsOnReplacements = ignorePvcRestrictionsOnReplacements;
    }

    public Boolean getShouldCordonBeforeScaleDown() {
        return shouldCordonBeforeScaleDown;
    }

    public void setShouldCordonBeforeScaleDown(Boolean shouldCordonBeforeScaleDown) {
        this.shouldCordonBeforeScaleDown = shouldCordonBeforeScaleDown;
    }

    public Boolean getShouldScaleDownPvcNodes() {
        return shouldScaleDownPvcNodes;
    }

    public void setShouldScaleDownPvcNodes(Boolean shouldScaleDownPvcNodes) {
        this.shouldScaleDownPvcNodes = shouldScaleDownPvcNodes;
    }

    public ScaleDownBehaviorDuringScaleUpFailuresEnum getScaleDownBehaviorDuringScaleUpFailures() {
        return scaleDownBehaviorDuringScaleUpFailures;
    }

    public void setScaleDownBehaviorDuringScaleUpFailures(
            ScaleDownBehaviorDuringScaleUpFailuresEnum scaleDownBehaviorDuringScaleUpFailures) {
        this.scaleDownBehaviorDuringScaleUpFailures = scaleDownBehaviorDuringScaleUpFailures;
    }

    public BlKubernetesAggressiveScaleDownInternalConfig getAggressiveScaleDown() {
        return aggressiveScaleDown;
    }

    public void setAggressiveScaleDown(BlKubernetesAggressiveScaleDownInternalConfig aggressiveScaleDown) {
        this.aggressiveScaleDown = aggressiveScaleDown;
    }

    public Integer getMaxMinutesToConsiderLatestCordonBatchForScaleDown() {
        return maxMinutesToConsiderLatestCordonBatchForScaleDown;
    }

    public void setMaxMinutesToConsiderLatestCordonBatchForScaleDown(
            Integer maxMinutesToConsiderLatestCordonBatchForScaleDown) {
        this.maxMinutesToConsiderLatestCordonBatchForScaleDown = maxMinutesToConsiderLatestCordonBatchForScaleDown;
    }

    //endregion

    //region Override Methods
    @Override
    public String toString() {
        return "BlKubernetesScaleDownInternalConfig{" + "utilizationThreshold=" + utilizationThreshold +
               ", underUtilizedDuration=" + underUtilizedDuration + ", ignorePvcRestrictionsOnUnhealthyReplacements=" +
               ignorePvcRestrictionsOnUnhealthyReplacements + ", ignorePvcRestrictionsOnReplacements=" +
               ignorePvcRestrictionsOnReplacements + ", shouldScaleDownPvcNodes=" + shouldScaleDownPvcNodes +
               ", shouldCordonBeforeScaleDown=" + shouldCordonBeforeScaleDown +
               ", scaleDownBehaviorDuringScaleUpFailures=" + scaleDownBehaviorDuringScaleUpFailures +
               ", aggressiveScaleDown=" + aggressiveScaleDown + ", maxMinutesToConsiderLatestCordonBatchForScaleDown=" +
               maxMinutesToConsiderLatestCordonBatchForScaleDown + '}';
    }
    //endregion
}
