package org.example.models.configs;

/**
 * Created by talzur on 06/11/2016.
 */
public class BlGroupEcsConfigAutoScaler {
    //region Members
    private Boolean                             requireEniPerHeadroomUnit;
    private BlGroupEcsConfigAutoScalerScaleDown scaleDown;
    private Boolean                             shouldDisableEniTrunking;
    private Boolean                             shouldPrintConstraintsLogs;
    //endregion

    //region Getter and Setter methods
    public BlGroupEcsConfigAutoScalerScaleDown getScaleDown() {
        return scaleDown;
    }

    public void setScaleDown(BlGroupEcsConfigAutoScalerScaleDown scaleDown) {
        this.scaleDown = scaleDown;
    }

    public Boolean getRequireEniPerHeadroomUnit() {
        return requireEniPerHeadroomUnit;
    }

    public void setRequireEniPerHeadroomUnit(Boolean requireEniPerHeadroomUnit) {
        this.requireEniPerHeadroomUnit = requireEniPerHeadroomUnit;
    }

    public Boolean getShouldDisableEniTrunking() {
        return shouldDisableEniTrunking;
    }

    public void setShouldDisableEniTrunking(Boolean shouldDisableEniTrunking) {
        this.shouldDisableEniTrunking = shouldDisableEniTrunking;
    }

    public Boolean getShouldPrintConstraintsLogs() {
        return shouldPrintConstraintsLogs;
    }

    public void setShouldPrintConstraintsLogs(Boolean shouldPrintConstraintsLogs) {
        this.shouldPrintConstraintsLogs = shouldPrintConstraintsLogs;
    }
    //endregion
}
