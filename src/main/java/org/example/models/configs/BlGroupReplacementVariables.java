package org.example.models.configs;

/**
 * Created by talzur on 06/11/2016.
 */
public class BlGroupReplacementVariables {
    //region Members
    private Integer                                maxReplacementBatchPercentage;
    private Integer                                defaultReplacementGracePeriod;
    private Integer                                maxPercentageOfReplacementsToDetach;
    private Integer                                maxReplacementsToDetach;
    private BlScheduledPreventiveReplacementConfig scheduledPreventive;
    private BlFixSpotDistributionConfig            fixSpotDistribution;
    private Integer                                cooldownAfterReplacementSeconds;
    private Integer                                unhealthyReplacementCancellationMinutes;
    //endregion

    //region Getter and Setter methods

    public Integer getMaxReplacementBatchPercentage() {
        return maxReplacementBatchPercentage;
    }

    public void setMaxReplacementBatchPercentage(Integer maxReplacementBatchPercentage) {
        this.maxReplacementBatchPercentage = maxReplacementBatchPercentage;
    }

    public Integer getDefaultReplacementGracePeriod() {
        return defaultReplacementGracePeriod;
    }

    public void setDefaultReplacementGracePeriod(Integer defaultReplacementGracePeriod) {
        this.defaultReplacementGracePeriod = defaultReplacementGracePeriod;
    }

    public Integer getMaxPercentageOfReplacementsToDetach() {
        return maxPercentageOfReplacementsToDetach;
    }

    public void setMaxPercentageOfReplacementsToDetach(Integer maxPercentageOfReplacementsToDetach) {
        this.maxPercentageOfReplacementsToDetach = maxPercentageOfReplacementsToDetach;
    }

    public Integer getMaxReplacementsToDetach() {
        return maxReplacementsToDetach;
    }

    public void setMaxReplacementsToDetach(Integer maxReplacementsToDetach) {
        this.maxReplacementsToDetach = maxReplacementsToDetach;
    }

    public BlScheduledPreventiveReplacementConfig getScheduledPreventive() {
        return scheduledPreventive;
    }

    public void setScheduledPreventive(BlScheduledPreventiveReplacementConfig scheduledPreventive) {
        this.scheduledPreventive = scheduledPreventive;
    }

    public BlFixSpotDistributionConfig getFixSpotDistribution() {
        return fixSpotDistribution;
    }

    public void setFixSpotDistribution(BlFixSpotDistributionConfig fixSpotDistribution) {
        this.fixSpotDistribution = fixSpotDistribution;
    }

    public Integer getCooldownAfterReplacementSeconds() {
        return cooldownAfterReplacementSeconds;
    }

    public void setCooldownAfterReplacementSeconds(Integer cooldownAfterReplacement) {
        this.cooldownAfterReplacementSeconds = cooldownAfterReplacement;
    }

    public Integer getUnhealthyReplacementCancellationMinutes() {
        return unhealthyReplacementCancellationMinutes;
    }

    public void setUnhealthyReplacementCancellationMinutes(Integer unhealthyReplacementCancellationMinutes) {
        this.unhealthyReplacementCancellationMinutes = unhealthyReplacementCancellationMinutes;
    }
    //endregion
}