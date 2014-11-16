package com.thedazzler.droidicon.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

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

    private TypefaceManager() {
    }

    public enum IconicTypeface {

        ENTYPO(R.raw.entypo),
        ENTYPO_SOCIAL(R.raw.entypo_social),
        FONT_AWESOME(R.raw.fontawesome_webfont),
        ICONIC(R.raw.iconic);

        private final int mTypefaceResourceId;
        private Typeface mTypeface;

        private IconicTypeface(int typefaceResourceId) {
            mTypefaceResourceId = typefaceResourceId;
        }

        /**
         * Loads a {@link Typeface} for the given icon font. 
         * {@link Typeface} is loaded only once to avoid memory consumption.
         *
         * @param context
         * @return {@link Typeface}
         */
        public Typeface getTypeface(final Context context) {
            if (mTypeface == null) {
                mTypeface = createTypefaceFromResource(context, mTypefaceResourceId);
            }

            return mTypeface;
        }
    }

    private static Typeface createTypefaceFromResource(final Context context, final int resource) {
        Typeface typeface = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = context.getResources().openRawResource(resource);
        } catch (NotFoundException ex) {
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
