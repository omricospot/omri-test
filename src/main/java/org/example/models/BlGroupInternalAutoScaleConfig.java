package org.example.models;

public class BlGroupInternalAutoScaleConfig {
    //region Members
    private boolean scaleDownWaitForEvaluationTimeAfterCoolDown;
    //endregion

    //region Getter and Setter methods

    public boolean isScaleDownWaitForEvaluationTimeAfterCoolDown() {
        return scaleDownWaitForEvaluationTimeAfterCoolDown;
    }

    public void setScaleDownWaitForEvaluationTimeAfterCoolDown(boolean scaleDownWaitForEvaluationTimeAfterCoolDown) {
        this.scaleDownWaitForEvaluationTimeAfterCoolDown = scaleDownWaitForEvaluationTimeAfterCoolDown;
    }

    @Override
    public String toString() {
        return "BlGroupInternalAutoScaleConfig{" + "scaleDownWaitForEvaluationTimeAfterCoolDown=" +
               scaleDownWaitForEvaluationTimeAfterCoolDown + '}';
    }
}
