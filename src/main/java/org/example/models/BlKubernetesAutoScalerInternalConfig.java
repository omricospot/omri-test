package org.example.models;

/**
 * Created by talzur on 06/11/2016.
 */
public class BlKubernetesAutoScalerInternalConfig {
    //region Members
    private BlKubernetesScaleDownInternalConfig scaleDown;
    private BlKubernetesScaleUpInternalConfig   scaleUp;
    private BlKubernetesResourcesInternalConfig defaultResources;
    private Boolean                             shouldHandleReplacements;
    private Boolean                             shouldIgnorePdbDuringOutOfStrategy;
    private Boolean                             shouldIgnorePdbDuringRevertToReserved;
    private Boolean                             shouldIgnorePdbDuringScaleDown;
    private Boolean                             shouldNotifyOnInactiveControllerHeartbeatImmediately;
    private Boolean                             shouldAllowPodOnNodeDuringImbalancedSkew;
    private Boolean                             shouldCreateDummyReplicaSets;
    //endregion

    //region Getter and Setter methods
    public BlKubernetesScaleDownInternalConfig getScaleDown() {
        return scaleDown;
    }

    public void setScaleDown(BlKubernetesScaleDownInternalConfig scaleDown) {
        this.scaleDown = scaleDown;
    }

    public BlKubernetesResourcesInternalConfig getDefaultResources() {
        return defaultResources;
    }

    public void setDefaultResources(BlKubernetesResourcesInternalConfig defaultResources) {
        this.defaultResources = defaultResources;
    }

    public BlKubernetesScaleUpInternalConfig getScaleUp() {
        return scaleUp;
    }

    public void setScaleUp(BlKubernetesScaleUpInternalConfig scaleUp) {
        this.scaleUp = scaleUp;
    }

    public Boolean getShouldHandleReplacements() {
        return shouldHandleReplacements;
    }

    public void setShouldHandleReplacements(Boolean shouldHandleReplacements) {
        this.shouldHandleReplacements = shouldHandleReplacements;
    }

    public Boolean getShouldIgnorePdbDuringOutOfStrategy() {
        return shouldIgnorePdbDuringOutOfStrategy;
    }

    public void setShouldIgnorePdbDuringOutOfStrategy(Boolean shouldIgnorePdbDuringOutOfStrategy) {
        this.shouldIgnorePdbDuringOutOfStrategy = shouldIgnorePdbDuringOutOfStrategy;
    }

    public Boolean getShouldIgnorePdbDuringRevertToReserved() {
        return shouldIgnorePdbDuringRevertToReserved;
    }

    public void setShouldIgnorePdbDuringRevertToReserved(Boolean shouldIgnorePdbDuringRevertToReserved) {
        this.shouldIgnorePdbDuringRevertToReserved = shouldIgnorePdbDuringRevertToReserved;
    }

    public Boolean getShouldIgnorePdbDuringScaleDown() {
        return shouldIgnorePdbDuringScaleDown;
    }

    public void setShouldIgnorePdbDuringScaleDown(Boolean shouldIgnorePdbDuringScaleDown) {
        this.shouldIgnorePdbDuringScaleDown = shouldIgnorePdbDuringScaleDown;
    }

    public Boolean getShouldNotifyOnInactiveControllerHeartbeatImmediately() {
        return shouldNotifyOnInactiveControllerHeartbeatImmediately;
    }

    public void setShouldNotifyOnInactiveControllerHeartbeatImmediately(Boolean shouldNotifyOnInactiveControllerHeartbeatImmediately) {
        this.shouldNotifyOnInactiveControllerHeartbeatImmediately =
                shouldNotifyOnInactiveControllerHeartbeatImmediately;
    }

    public Boolean getShouldAllowPodOnNodeDuringImbalancedSkew() {
        return shouldAllowPodOnNodeDuringImbalancedSkew;
    }

    public void setShouldAllowPodOnNodeDuringImbalancedSkew(Boolean shouldAllowPodOnNodeDuringImbalancedSkew) {
        this.shouldAllowPodOnNodeDuringImbalancedSkew = shouldAllowPodOnNodeDuringImbalancedSkew;
    }

    public Boolean getShouldCreateDummyReplicaSets() {
        return shouldCreateDummyReplicaSets;
    }

    public void setShouldCreateDummyReplicaSets(Boolean shouldCreateDummyReplicaSets) {
        this.shouldCreateDummyReplicaSets = shouldCreateDummyReplicaSets;
    }
    //endregion

    //region Override Methods
    @Override
    public String toString() {
        return "BlKubernetesAutoScalerInternalConfig{" + "scaleDown=" + scaleDown + ", scaleUp=" + scaleUp +
               ", defaultResources=" + defaultResources + ", shouldHandleReplacements=" + shouldHandleReplacements +
               ", shouldIgnorePdbDuringOutOfStrategy=" + shouldIgnorePdbDuringOutOfStrategy +
               ", shouldIgnorePdbDuringRevertToReserved=" + shouldIgnorePdbDuringRevertToReserved +
               ", shouldIgnorePdbDuringScaleDown=" + shouldIgnorePdbDuringScaleDown +
               ", shouldNotifyOnInactiveControllerHeartbeatImmediately=" +
               shouldNotifyOnInactiveControllerHeartbeatImmediately + ", shouldAllowPodOnNodeDuringImbalancedSkew=" +
               shouldAllowPodOnNodeDuringImbalancedSkew + ", shouldCreateDummyReplicaSets=" +
               shouldCreateDummyReplicaSets + '}';
    }
    //endregion
}
