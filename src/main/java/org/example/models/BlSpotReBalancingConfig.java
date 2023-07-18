package org.example.models;


/**
 * @author Stas Radchenko
 * @since 10/1/20
 */
public class BlSpotReBalancingConfig implements IReBalancingConfig {
    //region Members
    private Boolean disableSpotReBalancing;
    //endregion

    //region Getters & Setters
    public Boolean getDisableSpotReBalancing() {
        return disableSpotReBalancing;
    }

    public void setDisableSpotReBalancing(Boolean disableSpotReBalancing) {
        this.disableSpotReBalancing = disableSpotReBalancing;
    }
    //endregion

    //region Public Methods
    @Override
    public boolean isEnabled() {
        boolean retVal = disableSpotReBalancing != true;
        return retVal;
    }
    //endregion

    // region Override methods
    @Override
    public String toString() {
        return "BlSpotReBalancingConfig{" + "disableSpotReBalancing=" + disableSpotReBalancing + '}';
    }
    // endregion
}
