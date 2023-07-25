package org.example.models.configs;

/**
 * Created by talzur on 06/11/2016.
 */
public class BlGroupEcsConfigAutoScalerScaleDown {
    //region Members
    private Integer utilizationThreshold;
    private Boolean shouldKillNonServiceTasks;
    private Integer taskDisruptionBudgetPercentage;
    private Integer underUtilizedDuration;
    //endregion

    //region Getter and Setter methods

    public Integer getUtilizationThreshold() {
        return utilizationThreshold;
    }

    public void setUtilizationThreshold(Integer utilizationThreshold) {
        this.utilizationThreshold = utilizationThreshold;
    }

    public Boolean getShouldKillNonServiceTasks() {
        return shouldKillNonServiceTasks;
    }

    public void setShouldKillNonServiceTasks(Boolean shouldKillNonServiceTasks) {
        this.shouldKillNonServiceTasks = shouldKillNonServiceTasks;
    }

    public Integer getTaskDisruptionBudgetPercentage() {
        return taskDisruptionBudgetPercentage;
    }

    public void setTaskDisruptionBudgetPercentage(Integer taskDisruptionBudgetPercentage) {
        this.taskDisruptionBudgetPercentage = taskDisruptionBudgetPercentage;
    }

    public Integer getUnderUtilizedDuration() {
        return underUtilizedDuration;
    }

    public void setUnderUtilizedDuration(Integer underUtilizedDuration) {
        this.underUtilizedDuration = underUtilizedDuration;
    }
    //endregion
}