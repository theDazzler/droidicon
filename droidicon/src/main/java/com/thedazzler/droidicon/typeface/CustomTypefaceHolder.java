package com.thedazzler.droidicon.typeface;

import java.util.Map;

/**
 * Author: Zhibo Wei (zweicmu@gmail.com), 2/3/15.
 */
public class CustomTypefaceHolder extends TypefaceHolder {

    public CustomTypefaceHolder(String prefix, int resourceId, Map<String, Integer> iconMap) {
        super(prefix, resourceId);
        setIconMap(iconMap);
    }

}
