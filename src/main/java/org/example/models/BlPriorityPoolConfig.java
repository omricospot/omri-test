package org.example.models;

import java.util.List;

/**
 * Created by oriyemini on 10/06/2018.
 */
public class BlPriorityPoolConfig {

    //region Members
    private List<AwsInstanceTypeDynamicEnum.InstanceType> instanceTypes;
    private Integer                                       capacity;
    //endregion

    //region Getters & Setters

    public List<AwsInstanceTypeDynamicEnum.InstanceType> getInstanceTypes() {
        return instanceTypes;
    }

    public void setInstanceTypes(List<AwsInstanceTypeDynamicEnum.InstanceType> instanceTypes) {
        this.instanceTypes = instanceTypes;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    //endregion
}
