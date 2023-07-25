package org.example.models;


/**
 * @author itay.kirshenboim
 * @since 03/12/2020
 */
public class BlPreferredAzReBalancingConfig implements IReBalancingConfig {
    //region Members
    private Boolean disablePreferredAzReBalancing;
    //endregion

    //region Override Methods
    @Override
    public boolean isEnabled() {
        boolean retVal = disablePreferredAzReBalancing != true;
        return retVal;
    }
    //endregion

    //region Getters & Setters
    public Boolean getDisablePreferredAzReBalancing() {
        return disablePreferredAzReBalancing;
    }

    public void setDisablePreferredAzReBalancing(Boolean disablePreferredAzReBalancing) {
        this.disablePreferredAzReBalancing = disablePreferredAzReBalancing;
    }
    //endregion

    // region Override Methods
    @Override
    public String toString() {
        return "BlPreferredAzReBalancingConfig{" + "disablePreferredAzReBalancing=" + disablePreferredAzReBalancing +
               '}';
    }
    // endregion

}
