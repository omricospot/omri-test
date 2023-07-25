package org.example.models;

/**
 * Created by talzur on 31/10/2016.
 */
public class MarketKey {

    //region Members
    private AwsInstanceTypeDynamicEnum.InstanceType instanceType;
    private String                                  availabilityZone;
    //endregion

    public AwsInstanceTypeDynamicEnum.InstanceType getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(AwsInstanceTypeDynamicEnum.InstanceType instanceType) {
        this.instanceType = instanceType;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    //endregion

    //region Constructor

    public MarketKey() {
    }

    public MarketKey(AwsInstanceTypeDynamicEnum.InstanceType instanceType, String availabilityZone) {
        this.instanceType = instanceType;
        this.availabilityZone = availabilityZone;
    }
//
//        @Override
//        public String toString() {
//            return "Key{" +
//                    "instanceType='" + instanceType + '\'' +
//                    ", availabilityZone='" + availabilityZone + '\'' +
//                    '}';
//        }
    //endregion

    //region Object overrides

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarketKey that = (MarketKey) o;

        if (instanceType != null ? !instanceType.equals(that.instanceType) : that.instanceType != null)
            return false;
        return availabilityZone != null ? availabilityZone.equals(that.availabilityZone) : that.availabilityZone == null;

    }

    @Override
    public int hashCode() {
        int result = instanceType != null ? instanceType.hashCode() : 0;
        result = 31 * result + (availabilityZone != null ? availabilityZone.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MarketKey{" + "instanceType=" + instanceType + ", availabilityZone='" + availabilityZone + '\'' + '}';
    }

    //endregion
}
