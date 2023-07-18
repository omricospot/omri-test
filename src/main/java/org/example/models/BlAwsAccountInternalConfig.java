package org.example.models;

public class BlAwsAccountInternalConfig extends BlAwsBaseInternalConfig{
    private String accountId;
    private BlInstanceLimits                                instanceLimits;
    private Integer                                         maxGroupsAmount;
    private Float                                           maximumOnDemand;
    private ResourceScalingValueTypeEnum                    resourceScalingValueType;
    private Boolean                                         scaleUpByPricePerVCpu;
    private Boolean                                         scaleUpByAvailableIPs;
}
