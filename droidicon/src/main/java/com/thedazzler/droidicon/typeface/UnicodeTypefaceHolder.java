package com.thedazzler.droidicon.typeface;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;

/**
 * Author: Zhibo Wei (zweicmu@gmail.com), 2/3/15.
 */
public class UnicodeTypefaceHolder extends TypefaceHolder {

    private static final String TAG = "UnicodeTypefaceHolder";

    UnicodeTypefaceHolder(String prefix) {
        super(prefix, 0);
    }

    @Override
    public synchronized Typeface getTypeface(Context context) {
        return Typeface.DEFAULT;
    }

    @Override
    public int getIconUtfValue(String icon) {
        if (icon.contains("-") && !icon.endsWith("-")) {
            String unicodeStr = icon.substring(icon.indexOf("-") + 1);
            try {
                return Integer.decode(unicodeStr);
            } catch (NumberFormatException ex) {
                Log.e(TAG, "Cannot parse unicode : " + unicodeStr + " to integer val", ex);
                return 0;
            }
        } else {
            Log.e("The icon : " + icon + " is not a valid unicode icon name", null);
            return 0;
        }
    }
}
