package org.example.models;

/**
 * Created by oriyemini on 28/05/2018.
 */
public class BlGroupClusterModeConfig {

    //region Members
    private Boolean                         enabled;
    private GroupClusterIdentifierFieldEnum identifierField;
    private String                          identifierValue;
    //endregion

    //region Getters & Setters

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public GroupClusterIdentifierFieldEnum getIdentifierField() {
        return identifierField;
    }

    public void setIdentifierField(GroupClusterIdentifierFieldEnum identifierField) {
        this.identifierField = identifierField;
    }

    public String getIdentifierValue() {
        return identifierValue;
    }

    public void setIdentifierValue(String identifierValue) {
        this.identifierValue = identifierValue;
    }

    //endregion

    @Override
    public String toString() {
        return "BlGroupClusterModeConfig{" + "enabled=" + enabled + ", identifierField=" + identifierField +
               ", identifierValue='" + identifierValue + '\'' + '}';
    }
}
