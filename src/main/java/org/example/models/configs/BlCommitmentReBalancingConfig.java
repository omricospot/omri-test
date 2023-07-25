package org.example.models.configs;


/**
 * @author Stas Radchenko
 * @since 10/1/20
 */
public class BlCommitmentReBalancingConfig implements IReBalancingConfig {
    //region Members
    private Boolean disableCommitmentReBalancing;
    //endregion

    //region Getters & Setters
    public Boolean getDisableCommitmentReBalancing() {
        return disableCommitmentReBalancing;
    }

    public void setDisableCommitmentReBalancing(Boolean disableCommitmentReBalancing) {
        this.disableCommitmentReBalancing = disableCommitmentReBalancing;
    }
    //endregion

    //region Public Methods
    @Override
    public boolean isEnabled() {
        boolean retVal =disableCommitmentReBalancing != true;
        return retVal;
    }
    //endregion

    // region Override methods
    @Override
    public String toString() {
        return "BlCommitmentReBalancingConfig{" + "disableCommitmentReBalancing=" + disableCommitmentReBalancing + '}';
    }
    // endregion

}
