package org.example.models;

/**
 * Created by talzur on 06/11/2016.
 */
public class BlKubernetesScaleUpInternalConfig {
    //region Members
    private Boolean preventHandlingUnconstrainedWorkload;
    private Boolean dontIncrementInstanceSizesOnScaleOut;
    private Integer maxScaleUpRetriesForUnscheduledPod;
    //endregion

    //region Getter and Setter methods
    public Boolean getPreventHandlingUnconstrainedWorkload() {
        return preventHandlingUnconstrainedWorkload;
    }

    public void setPreventHandlingUnconstrainedWorkload(Boolean preventHandlingUnconstrainedWorkload) {
        this.preventHandlingUnconstrainedWorkload = preventHandlingUnconstrainedWorkload;
    }

    public Boolean getDontIncrementInstanceSizesOnScaleOut() {
        return dontIncrementInstanceSizesOnScaleOut;
    }

    public void setDontIncrementInstanceSizesOnScaleOut(Boolean dontIncrementInstanceSizesOnScaleOut) {
        this.dontIncrementInstanceSizesOnScaleOut = dontIncrementInstanceSizesOnScaleOut;
    }

    public Integer getMaxScaleUpRetriesForUnscheduledPod() {
        return maxScaleUpRetriesForUnscheduledPod;
    }

    public void setMaxScaleUpRetriesForUnscheduledPod(Integer maxScaleUpRetriesForUnscheduledPod) {
        this.maxScaleUpRetriesForUnscheduledPod = maxScaleUpRetriesForUnscheduledPod;
    }

    //endregion
}
