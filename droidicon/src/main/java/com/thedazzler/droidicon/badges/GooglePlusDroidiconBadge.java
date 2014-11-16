package com.thedazzler.droidicon.badges;

import android.content.Context;
import android.util.AttributeSet;

import com.thedazzler.droidicon.R;

/**
 * Created by Devon Guinane on 11/16/14.
 * Droidicon
 */
public class GooglePlusDroidiconBadge extends PremadeDroidiconBadge {
    public GooglePlusDroidiconBadge(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public GooglePlusDroidiconBadge(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GooglePlusDroidiconBadge(Context context) {
        super(context);
    }

    @Override
    int getDefaultColor() {
        return R.color.googleplus;
    }

    @Override
    String getIcon() {
        return "esocial-c-google-plus";
    }
}
