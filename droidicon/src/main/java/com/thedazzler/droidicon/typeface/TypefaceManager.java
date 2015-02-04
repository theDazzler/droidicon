package com.thedazzler.droidicon.typeface;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.Typeface;
import android.util.Log;

import com.thedazzler.droidicon.R;

/**
 * Helper class that wraps icon fonts and manages {@link Typeface} loading.
 */
public class TypefaceManager {

    private static final String TAG = "TypefaceManager";

    private static TypefaceManager instance = null;

    private static final String ENTYPO_PREFIX = "entypo";
    private static final EntypoTypefaceHolder ENTYPO_TYPEFACE_HOLDER =
            new EntypoTypefaceHolder(ENTYPO_PREFIX, R.raw.entypo);

    private static final String ENTYPO_SOCIAL_PREFIX = "esocial";
    private static final EsocialTypefaceHolder ESOCIAL_TYPEFACE_HOLDER =
            new EsocialTypefaceHolder(ENTYPO_SOCIAL_PREFIX, R.raw.entypo_social);

    private static final String FONT_AWESOME_PREFIX = "fa";
    private static final FontAwesomeTypefaceHolder FONT_AWESOME_TYPEFACE_HOLDER =
            new FontAwesomeTypefaceHolder(FONT_AWESOME_PREFIX, R.raw.fontawesome_webfont);

    private static final String ICONIC_PREFIX = "iconic";
    private static final IconicTypefaceHolder ICONIC_TYPEFACE_HOLDER =
            new IconicTypefaceHolder(ICONIC_PREFIX, R.raw.iconic);

    private static final String GOOGLE_MATERIAL_DESIGN_PREFIX = "gmd";
    private static final GmdTypefaceHolder GMD_TYPEFACE_HOLDER =
            new GmdTypefaceHolder(GOOGLE_MATERIAL_DESIGN_PREFIX, R.raw.google_material_design);

    private static final String METEOCON_PREFIX = "meteo";
    private static final MeteoconTypefaceHolder METEOCON_TYPEFACE_HOLDER =
            new MeteoconTypefaceHolder(METEOCON_PREFIX, R.raw.meteocons);

    private static final String UNICODE_PREFIX = "unicode";
    private static final UnicodeTypefaceHolder UNICODE_TYPEFACE_HOLDER =
            new UnicodeTypefaceHolder(UNICODE_PREFIX);

    private final Map<String, TypefaceHolder> typefaceHolderMap;

    private TypefaceManager() {
        this.typefaceHolderMap = new HashMap<String, TypefaceHolder>();
        //Add the default typefaces
        this.typefaceHolderMap.put(ENTYPO_PREFIX, ENTYPO_TYPEFACE_HOLDER);
        this.typefaceHolderMap.put(ENTYPO_SOCIAL_PREFIX, ESOCIAL_TYPEFACE_HOLDER);
        this.typefaceHolderMap.put(FONT_AWESOME_PREFIX, FONT_AWESOME_TYPEFACE_HOLDER);
        this.typefaceHolderMap.put(ICONIC_PREFIX, ICONIC_TYPEFACE_HOLDER);
        this.typefaceHolderMap.put(GOOGLE_MATERIAL_DESIGN_PREFIX, GMD_TYPEFACE_HOLDER);
        this.typefaceHolderMap.put(METEOCON_PREFIX, METEOCON_TYPEFACE_HOLDER);
        this.typefaceHolderMap.put(UNICODE_PREFIX, UNICODE_TYPEFACE_HOLDER);
    }

    public static synchronized TypefaceManager getInstance() {
        if (instance == null) {
            instance = new TypefaceManager();
        }
        return instance;
    }

    public TypefaceHolder getTypefaceHolderByIconName(String iconName) {
        for (String prefix : typefaceHolderMap.keySet()) {
            if (iconName.startsWith(prefix)) {
                return typefaceHolderMap.get(prefix);
            }
        }
        return null;
    }

    public void addNewTypefaceHolder(CustomTypefaceHolder typefaceHolder) {
        if (typefaceHolder != null && typefaceHolder.getPrefix() != null) {
            this.typefaceHolderMap.put(typefaceHolder.getPrefix(), typefaceHolder);
        }
    }

}
