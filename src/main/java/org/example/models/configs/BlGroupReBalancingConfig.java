package org.example.models.configs;

/**
 * @author Stas Radchenko
 * @since 10/6/20
 */
public class BlGroupReBalancingConfig {
    //region Members
    private Double                           maxReplacementsPercentage;
    private BlPredictiveReBalancingConfig    predictiveReBalancingConfig;
    private BlCommitmentReBalancingConfig    commitmentReBalancingConfig;
    private BlSpotReBalancingConfig          spotReBalancingConfig;
    private BlPreferredTypeReBalancingConfig preferredTypeReBalancingConfig;
    private BlPreferredAzReBalancingConfig   preferredAzReBalancingConfig;
    //endregion

    //region Getters & Setters
    public Double getMaxReplacementsPercentage() {
        return maxReplacementsPercentage;
    }

    public void setMaxReplacementsPercentage(Double maxReplacementsPercentage) {
        this.maxReplacementsPercentage = maxReplacementsPercentage;
    }

    public BlPredictiveReBalancingConfig getPredictiveReBalancingConfig() {
        return predictiveReBalancingConfig;
    }

    public void setPredictiveReBalancingConfig(BlPredictiveReBalancingConfig predictiveReBalancingConfig) {
        this.predictiveReBalancingConfig = predictiveReBalancingConfig;
    }

    public BlCommitmentReBalancingConfig getCommitmentReBalancingConfig() {
        return commitmentReBalancingConfig;
    }

    public void setCommitmentReBalancingConfig(BlCommitmentReBalancingConfig commitmentReBalancingConfig) {
        this.commitmentReBalancingConfig = commitmentReBalancingConfig;
    }

    public BlSpotReBalancingConfig getSpotReBalancingConfig() {
        return spotReBalancingConfig;
    }

    public void setSpotReBalancingConfig(BlSpotReBalancingConfig spotReBalancingConfig) {
        this.spotReBalancingConfig = spotReBalancingConfig;
    }

    public BlPreferredTypeReBalancingConfig getPreferredTypeReBalancingConfig() {
        return preferredTypeReBalancingConfig;
    }

    public void setPreferredTypeReBalancingConfig(BlPreferredTypeReBalancingConfig preferredTypeReBalancingConfig) {
        this.preferredTypeReBalancingConfig = preferredTypeReBalancingConfig;
    }

    public BlPreferredAzReBalancingConfig getPreferredAzReBalancingConfig() {
        return preferredAzReBalancingConfig;
    }

    public void setPreferredAzReBalancingConfig(BlPreferredAzReBalancingConfig preferredAzReBalancingConfig) {
        this.preferredAzReBalancingConfig = preferredAzReBalancingConfig;
    }
    //endregion

    // region Override Methods
    @Override
    public String toString() {
        return "BlGroupReBalancingConfig{" + "maxReplacementsPercentage=" + maxReplacementsPercentage +
               ", predictiveReBalancingConfig=" + predictiveReBalancingConfig + ", commitmentReBalancingConfig=" +
               commitmentReBalancingConfig + ", spotReBalancingConfig=" + spotReBalancingConfig +
               ", preferredTypeReBalancingConfig=" + preferredTypeReBalancingConfig +
               ", preferredAzReBalancingConfig=" + preferredAzReBalancingConfig + '}';
    }
    // endregion
}
