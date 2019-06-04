package com.company;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceProperties {
    private ResourceBundle bundle;

    public ResourceProperties(Locale locale) {
        bundle = ResourceBundle
                .getBundle("resources.prop", locale);
    }

    public String getValue(String key) {
        return bundle.getString(key);
    }




}
