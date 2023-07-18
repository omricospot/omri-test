package org.example.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BlInstanceLimits {
    //region Members
    private Integer                      global;
    private List<RegionalInstancesLimit> regional;
    //endregion

    //region Getter and Setter methods
    public Integer getGlobal() {
        return global;
    }

    public void setGlobal(Integer global) {
        this.global = global;
    }

    public List<RegionalInstancesLimit> getRegional() {
        return regional;
    }

    public void setRegional(List<RegionalInstancesLimit> regional) {
        this.regional = regional;
    }
    //endregion
}
