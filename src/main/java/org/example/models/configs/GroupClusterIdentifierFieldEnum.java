package org.example.models.configs;

/**
 * Created by oriyemini on 28/05/2018.
 */
public enum GroupClusterIdentifierFieldEnum {

    TAG_KEY("tagKey"),
    NAME_PREFIX("namePrefix"),
    NAME_SUFFIX("nameSuffix");

    private GroupClusterIdentifierFieldEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private final String name;

    public static GroupClusterIdentifierFieldEnum fromName(String name) {
        GroupClusterIdentifierFieldEnum retVal = null;
        for (GroupClusterIdentifierFieldEnum identifierFieldEnum : GroupClusterIdentifierFieldEnum.values()) {
            if (name.equalsIgnoreCase(identifierFieldEnum.name)) {
                retVal = identifierFieldEnum;
                break;
            }
        }

        if (retVal == null) {
        }
        return retVal;
    }
}
