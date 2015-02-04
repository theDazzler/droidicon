package com.thedazzler.droidicon.typeface;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Zhibo Wei (zweicmu@gmail.com), 2/3/15.
 */
public abstract class TypefaceHolder {

    private static final String TAG = "TypefaceHolder";

    Typeface typeface = null;
    private Map<String, Integer> iconMap = null;
    private final String prefix;
    private final int resourceId;

    TypefaceHolder(String prefix, int resourceId) {
        this.prefix = prefix;
        this.resourceId = resourceId;
    }

    /**
     * Loads a {@link Typeface} for the given icon font.
     * {@link Typeface} is loaded only once to avoid memory consumption.
     *
     * @param context
     * @return {@link Typeface}
     */
    public synchronized Typeface getTypeface(final Context context) {
        if (this.typeface != null) {
            return typeface;
        } else {
            this.typeface = createTypefaceFromResource(context, this.resourceId);
            return typeface;
        }
    }

    public int getIconUtfValue(String icon) {
        return iconMap.get(icon);
    }

    protected void setIconMap(Map<String, Integer> iconMap) {
        this.iconMap = iconMap;
    }

    String getPrefix() {
        return this.prefix;
    }

    static Typeface createTypefaceFromResource(final Context context, final int resource) {
        Typeface typeface = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = context.getResources().openRawResource(resource);
        } catch (Resources.NotFoundException ex) {
            Log.e(TAG, "Could not find typeface in resources.", ex);
        }

        String outPath = context.getCacheDir() + "/tmp.raw";

        try {
            byte[] buffer = new byte[inputStream.available()];
            outputStream = new BufferedOutputStream(new FileOutputStream(outPath));

            int l = 0;
            while ((l = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, l);
            }

            typeface = Typeface.createFromFile(outPath);

            new File(outPath).delete();
        } catch (IOException ex) {
            Log.e(TAG, "Error reading typeface from resource.", ex);
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException ex) {
                Log.e(TAG, "Error closing typeface streams.", ex);
            }
        }

        return typeface;
    }

}
