package org.example.models.configs;


/**
 * Created by aharontwizer on 9/22/15.
 */
public enum HealthCheckTypeEnum {
    ELB("ELB"),
    TARGET_GROUP("TARGET_GROUP"),
    HCS("HCS"),
    MLB("MLB"),
    EC2("EC2"),
    MULTAI_TARGET_SET("MULTAI_TARGET_SET"),
    MLB_RUNTIME("MLB_RUNTIME"),
    K8S_NODE("K8S_NODE"),
    NOMAD_NODE("NOMAD_NODE"),
    ECS_CLUSTER_INSTANCE("ECS_CLUSTER_INSTANCE"),
    OPSWORKS("OPSWORKS");

    private HealthCheckTypeEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private final        String name;

}
