package org.example.models;

public class BlInternalMarketScoreOrientationThresholdConfig {
    //region Members
    private Float costMarketScoreThreshold;
    private Float cheapestMarketScoreThreshold;
    private Float balancedMarketScoreThreshold;
    private Float availabilityMarketScoreThreshold;
    private Float equalAZMarketScoreThreshold;
    private Double realtimeMarketThreshold;
    //endregion

    //region Getters & Setters
    public Double getRealtimeMarketThreshold() {
        return realtimeMarketThreshold;
    }

    public void setRealtimeMarketThreshold(Double realtimeMarketThreshold) {
        this.realtimeMarketThreshold = realtimeMarketThreshold;
    }

    public Float getCostMarketScoreThreshold() {
        return costMarketScoreThreshold;
    }

    public void setCostMarketScoreThreshold(Float costMarketScoreThreshold) {
        this.costMarketScoreThreshold = costMarketScoreThreshold;
    }

    public Float getCheapestMarketScoreThreshold() {
        return cheapestMarketScoreThreshold;
    }

    public void setCheapestMarketScoreThreshold(Float cheapestMarketScoreThreshold) {
        this.cheapestMarketScoreThreshold = cheapestMarketScoreThreshold;
    }

    public Float getBalancedMarketScoreThreshold() {
        return balancedMarketScoreThreshold;
    }

    public void setBalancedMarketScoreThreshold(Float balancedMarketScoreThreshold) {
        this.balancedMarketScoreThreshold = balancedMarketScoreThreshold;
    }

    public Float getAvailabilityMarketScoreThreshold() {
        return availabilityMarketScoreThreshold;
    }

    public void setAvailabilityMarketScoreThreshold(Float availabilityMarketScoreThreshold) {
        this.availabilityMarketScoreThreshold = availabilityMarketScoreThreshold;
    }

    public Float getEqualAZMarketScoreThreshold() {
        return equalAZMarketScoreThreshold;
    }

    public void setEqualAZMarketScoreThreshold(Float equalAZMarketScoreThreshold) {
        this.equalAZMarketScoreThreshold = equalAZMarketScoreThreshold;
    }
    //endregion


    //region Overriden Methods
    @Override
    public String toString() {
        return "BlInternalMarketScoreOrientationThresholdConfig{" + "costMarketScoreThreshold=" +
               costMarketScoreThreshold + ", cheapestMarketScoreThreshold=" + cheapestMarketScoreThreshold +
               ", balancedMarketScoreThreshold=" + balancedMarketScoreThreshold +
               ", availabilityMarketScoreThreshold=" + availabilityMarketScoreThreshold +
               ", equalAZMarketScoreThreshold=" + equalAZMarketScoreThreshold +
               ", realtimeMarketThreshold=" + realtimeMarketThreshold + '}';
    }
    //endregion
}
