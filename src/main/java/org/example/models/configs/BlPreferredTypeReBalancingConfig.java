package org.example.models.configs;


/**
 * @author oleksandr.v
 * @since 07/11/2020
 */
public class BlPreferredTypeReBalancingConfig implements IReBalancingConfig {

    //region Members
    private Boolean disablePreferredTypesReBalancing;
    //endregion

    //region Override Methods
    @Override
    public boolean isEnabled() {
        boolean retVal = disablePreferredTypesReBalancing != true;
        return retVal;
    }
    //endregion

    //region Getters & Setters
    public Boolean getDisablePreferredTypesReBalancing() {
        return disablePreferredTypesReBalancing;
    }

    public void setDisablePreferredTypesReBalancing(Boolean disablePreferredTypesReBalancing) {
        this.disablePreferredTypesReBalancing = disablePreferredTypesReBalancing;
    }
    //endregion

    // region Override methods
    @Override
    public String toString() {
        return "BlPreferredTypeReBalancingConfig{" + "disablePreferredTypesReBalancing=" +
               disablePreferredTypesReBalancing + '}';
    }
    // endregion
}
