package in.ashwanthkumar.gocd.github.util;

import in.ashwanthkumar.gocd.github.util.field.PartOfIdentity;
import in.ashwanthkumar.gocd.github.util.field.Required;
import in.ashwanthkumar.gocd.github.util.field.Secure;

import java.util.HashMap;
import java.util.Map;

public class FieldFactory {

    public static final String CHECKBOX_TRUE_VALUE = "on";

    /**
     * Create plugin setting field for SCM view
     * @param displayName
     * @param defaultValue
     * @param isPartOfIdentity
     * @param isRequired
     * @param isSecure
     * @param displayOrder
     * @return
     */
    public static Map<String, Object> createForScm(String displayName, String defaultValue, PartOfIdentity isPartOfIdentity, Required isRequired, Secure isSecure, int displayOrder) {
        Map<String, Object> fieldProperties = new HashMap<String, Object>();
        fieldProperties.put("display-name", displayName);
        fieldProperties.put("default-value", defaultValue);
        fieldProperties.put("part-of-identity", isPartOfIdentity.toBoolean());
        fieldProperties.put("required", isRequired.toBoolean());
        fieldProperties.put("secure", isSecure.toBoolean());
        fieldProperties.put("display-order", Integer.toString(displayOrder));
        return fieldProperties;
    }

    /**
     * Create plugin setting field for plugin general settings view
     * @param displayName
     * @param defaultValue
     * @param isRequired
     * @param isSecure
     * @param displayOrder
     * @return
     */
    public static Map<String, Object> createForGeneral(String displayName, String defaultValue, Required isRequired, Secure isSecure, int displayOrder) {
        Map<String, Object> fieldProperties = new HashMap<String, Object>();
        fieldProperties.put("display-name", displayName);
        fieldProperties.put("default-value", defaultValue);
        fieldProperties.put("required", isRequired.toBoolean());
        fieldProperties.put("secure", isSecure.toBoolean());
        fieldProperties.put("display-order", Integer.toString(displayOrder));
        return fieldProperties;
    }

}
