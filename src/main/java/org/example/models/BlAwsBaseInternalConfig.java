package org.example.models;

import java.util.List;

public class BlAwsBaseInternalConfig {

    /**
     * The amount of backup AMI's to use
     */
    private Integer                                         amiBackupCount;
    /**
     * a new config
     */
    private Integer aNewConfig;
    private Boolean                    replaceEndangeredSpotInstances;
    private BlMlbInternalConfig        mlb;
    private BlGroupClusterModeConfig   clusterMode;
    private BlGroupHealthCheckConfig                        healthCheckConfig;
    private BlGroupEcsConfig                                ecs;
    private BlKubernetesInternalConfig                      kubernetes;
    private BlGroupNomadConfig                              nomad;
    private BlGroupDockerSwarmConfig                        dockerSwarm;
    private BlGroupReplacementVariables                     groupReplacementVariables;
    private BlGroupReBalancingConfig                        groupReBalancingConfig;
    private Boolean                                         persistentLastIpRoute53;
    private BlScheduling                                    scheduling;
    private BlInternalConfigLocalBanMarketsTTL              localBanMarketsTTL;
    private BlGroupInternalAutoScaleConfig                  autoScale;
    private Boolean                                         terminationWindowForWindowsInstances;
    private ReplacementTypeEnum                             signalTimeoutReplacementType;
    private BlNfuRiUtilizationConfig                        nfuRiUtilizationConfig;
    private BlGroupInternalPredictiveScalingConfig          predictiveScalingConfig;
    private Boolean                                         shouldIgnoreSpotByOdPricesLimitation;
    private ResourceScalingValueTypeEnum                    resourceScalingValueType;
    private Boolean                                         shouldAsyncDeregisterOnInterruption;
    private Boolean                                         isSpotBlocksEnabled;
    private Integer                                         spotBlockMinutes;
    private Integer                                         instancesPerAdditionalMinPreferredMarket;
    private Float                                           preferredMarketDistributionLoadMultiplier;
    private Integer                                         preferredMinThreshold;
    private BlPriorityPoolConfig                            priorityPool;
    private String                                          mappings;
    private Float                                           linuxSavingsPercentageThreshold;
    private Float                                           windowsSavingsPercentageThreshold;
    private Float                                           redHatSavingsPercentageThreshold;
    private Float                                           linuxAvailabilityPercentageThreshold;
    private Float                                           gpuLinuxAvailabilityPercentageThreshold;
    private Float                                           windowsAvailabilityPercentageThreshold;
    private Float                                           gpuWindowsAvailabilityPercentageThreshold;
    private BlInternalConfigGlobalBanMarketsTTL             globalBanMarketsTTL;
    private Float                                           costOrientationCheapestSpotRelativePercentage;
    private Boolean                                         allowOdFromSpotTypes;
    private List<String>                                    preferredOdTypes;
    private BlInternalMarketScoreOrientationThresholdConfig orientationThresholdConfig;
    private Boolean                                         shouldEnforceMaxOnRecover;
    private Boolean                                         scaleUpByPricePerVCpu;
    private Boolean                                         scaleUpByAvailableIPs;
    private BlInternalConfigLocalSpotBanMarketsTTL          localSpotBanMarketsTTL;

    /**
     * test internal config
     */
    private Integer test;
}
