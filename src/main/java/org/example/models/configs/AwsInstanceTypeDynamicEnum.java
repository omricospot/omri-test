package org.example.models.configs;


import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Created by aharontwizer on 7/22/15.
 */
public class AwsInstanceTypeDynamicEnum {

    private static List<InstanceType> values;

    public static List<InstanceType> getValues() {
        return values;
    }

    public static void setValues(List<String> values) {

        List<InstanceType> instanceTypes = new LinkedList<>();
        for (String value : values) {
            InstanceType instanceType = new InstanceType(value);
            instanceTypes.add(instanceType);
        }

        AwsInstanceTypeDynamicEnum.values = instanceTypes;
    }

    public static InstanceType fromName(String name) {
        InstanceType retVal = null;

        for (InstanceType instanceTypeEnum : AwsInstanceTypeDynamicEnum.getValues()) {
            if (Objects.equals(name, instanceTypeEnum.getName())) {
                retVal = instanceTypeEnum;
                break;
            }
        }

        if (retVal == null) {

        }
        return retVal;
    }

    public static class InstanceType implements Serializable {
        private String name;

        public InstanceType(String name) {
            this.name = name;
        }

        public InstanceType() {
        }

        public String getName() {
            return name;
        }

        public String getInstanceFamily() {
            int    dot    = name.indexOf(".");
            String family = name.substring(0, dot);

            return family;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            InstanceType that = (InstanceType) o;

            return getName() != null ? getName().equals(that.getName()) : that.getName() == null;

        }

        @Override
        public int hashCode() {
            return getName() != null ? getName().hashCode() : 0;
        }

        @Override
        public String toString() {
            return "InstanceType{" + "name='" + name + '\'' + '}';
        }
    }
}
