package org.example.models.base;

import org.example.models.configs.BlInstanceLimits;
import org.example.models.configs.ResourceScalingValueTypeEnum;

public class BlAwsAccountInternalConfig extends BlAwsBaseInternalConfig {
    private String                       accountId;
    private BlInstanceLimits             instanceLimits;
    private Integer                      maxGroupsAmount;
    private Float                        maximumOnDemand;
    private ResourceScalingValueTypeEnum resourceScalingValueType;
    private Boolean                      scaleUpByPricePerVCpu;
    private Boolean                                         scaleUpByAvailableIPs;
    
}
