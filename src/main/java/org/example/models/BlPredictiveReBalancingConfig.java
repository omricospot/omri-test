package org.example.models;


import java.util.Map;

/**
 * @author Stas Radchenko
 * @since 10/1/20
 */
public class BlPredictiveReBalancingConfig implements IReBalancingConfig {
    //region Members
    private Double               marketRiskPercentageThreshold;
    private Double               replacementPercentageThreshold;
    private Boolean              disablePredictiveReBalancing;
    private Map<String, Boolean> fallbackToODByClusterOrientation;
    private Map<String, Double>  riskPercentageThresholdByOrientation;
    //endregion

    //region Getters & Setters
    public Double getMarketRiskPercentageThreshold() {
        return marketRiskPercentageThreshold;
    }

    public void setMarketRiskPercentageThreshold(Double marketRiskPercentageThreshold) {
        this.marketRiskPercentageThreshold = marketRiskPercentageThreshold;
    }

    public Boolean getDisablePredictiveReBalancing() {
        return disablePredictiveReBalancing;
    }

    public void setDisablePredictiveReBalancing(Boolean disablePredictiveReBalancing) {
        this.disablePredictiveReBalancing = disablePredictiveReBalancing;
    }

    public Map<String, Boolean> getFallbackToODByClusterOrientation() {
        return fallbackToODByClusterOrientation;
    }

    public void setFallbackToODByClusterOrientation(Map<String, Boolean> fallbackToODByClusterOrientation) {
        this.fallbackToODByClusterOrientation = fallbackToODByClusterOrientation;
    }

    public Map<String, Double> getRiskPercentageThresholdByOrientation() {
        return riskPercentageThresholdByOrientation;
    }

    public void setRiskPercentageThresholdByOrientation(Map<String, Double> riskPercentageThresholdByOrientation) {
        this.riskPercentageThresholdByOrientation = riskPercentageThresholdByOrientation;
    }

    public Double getReplacementPercentageThreshold() {
        return replacementPercentageThreshold;
    }

    public void setReplacementPercentageThreshold(Double replacementPercentageThreshold) {
        this.replacementPercentageThreshold = replacementPercentageThreshold;
    }

    //endregion

    //region Public Methods
    @Override
    public boolean isEnabled() {
        boolean retVal = disablePredictiveReBalancing != true;
        return retVal;
    }

    @Override
    public String toString() {
        return "BlPredictiveReBalancingConfig{" + "marketRiskPercentageThreshold=" + marketRiskPercentageThreshold +
               ", disablePredictiveReBalancing=" + disablePredictiveReBalancing +
               ", fallbackToODByClusterOrientation=" + fallbackToODByClusterOrientation +
               ", riskPercentageThresholdByOrientation=" + riskPercentageThresholdByOrientation +
               ", replacementPercentageThreshold=" + replacementPercentageThreshold + '}';
    }
    //endregion

}
