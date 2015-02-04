package com.thedazzler.droidicon.typeface;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Zhibo Wei (zweicmu@gmail.com), 2/3/15.
 */
public class MeteoconTypefaceHolder extends TypefaceHolder {

    private final Map<String, Integer> meteoconIconMap = new HashMap<String, Integer>();

    MeteoconTypefaceHolder(String prefix, int resourceId) {
        super(prefix, resourceId);
        initIconMap();
        setIconMap(meteoconIconMap);
    }

    private void initIconMap() {
        meteoconIconMap.put("meteo-sunrise", 0xe600 );
        meteoconIconMap.put("meteo-sun", 0xe601 );
        meteoconIconMap.put("meteo-moon", 0xe602 );
        meteoconIconMap.put("meteo-sun2", 0xe603 );
        meteoconIconMap.put("meteo-windy", 0xe604 );
        meteoconIconMap.put("meteo-wind", 0xe605 );
        meteoconIconMap.put("meteo-snowflake", 0xe606 );
        meteoconIconMap.put("meteo-cloudy", 0xe607 );
        meteoconIconMap.put("meteo-cloud", 0xe608 );
        meteoconIconMap.put("meteo-weather", 0xe609 );
        meteoconIconMap.put("meteo-weather2", 0xe60a );
        meteoconIconMap.put("meteo-weather3", 0xe60b );
        meteoconIconMap.put("meteo-lines", 0xe60c );
        meteoconIconMap.put("meteo-cloud2", 0xe60d );
        meteoconIconMap.put("meteo-lightning", 0xe60e );
        meteoconIconMap.put("meteo-lightning2", 0xe60f );
        meteoconIconMap.put("meteo-rainy", 0xe610 );
        meteoconIconMap.put("meteo-rainy2", 0xe611 );
        meteoconIconMap.put("meteo-windy2", 0xe612 );
        meteoconIconMap.put("meteo-windy3", 0xe613 );
        meteoconIconMap.put("meteo-snowy", 0xe614 );
        meteoconIconMap.put("meteo-snowy2", 0xe615 );
        meteoconIconMap.put("meteo-snowy3", 0xe616 );
        meteoconIconMap.put("meteo-weather4", 0xe617 );
        meteoconIconMap.put("meteo-cloudy2", 0xe618 );
        meteoconIconMap.put("meteo-cloud3", 0xe619 );
        meteoconIconMap.put("meteo-lightning3", 0xe61a );
        meteoconIconMap.put("meteo-sun3", 0xe61b );
        meteoconIconMap.put("meteo-moon2", 0xe61c );
        meteoconIconMap.put("meteo-cloudy3", 0xe61d );
        meteoconIconMap.put("meteo-cloud4", 0xe61e );
        meteoconIconMap.put("meteo-cloud5", 0xe61f );
        meteoconIconMap.put("meteo-lightning4", 0xe620 );
        meteoconIconMap.put("meteo-rainy3", 0xe621 );
        meteoconIconMap.put("meteo-rainy4", 0xe622 );
        meteoconIconMap.put("meteo-windy4", 0xe623 );
        meteoconIconMap.put("meteo-windy5", 0xe624 );
        meteoconIconMap.put("meteo-snowy4", 0xe625 );
        meteoconIconMap.put("meteo-snowy5", 0xe626 );
        meteoconIconMap.put("meteo-weather5", 0xe627 );
        meteoconIconMap.put("meteo-cloudy4", 0xe628 );
        meteoconIconMap.put("meteo-lightning5", 0xe629 );
        meteoconIconMap.put("meteo-thermometer", 0xe62a );
        meteoconIconMap.put("meteo-compass", 0xe62b );
        meteoconIconMap.put("meteo-none", 0xe62c );
        meteoconIconMap.put("meteo-Celsius", 0xe62d );
        meteoconIconMap.put("meteo-Fahrenheit", 0xe62e );
    }

}
