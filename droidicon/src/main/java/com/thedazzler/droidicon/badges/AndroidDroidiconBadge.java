package com.thedazzler.droidicon.badges;

import android.content.Context;
import android.util.AttributeSet;

import com.thedazzler.droidicon.R;

/**
 * Created by Devon Guinane on 11/16/14.
 * Droidicon
 */
public class AndroidDroidiconBadge extends NoCirclePremadeDroidiconBadge {
    public AndroidDroidiconBadge(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public AndroidDroidiconBadge(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AndroidDroidiconBadge(Context context) {
        super(context);
    }

    @Override
    int getColor() {
        return R.color.android;
    }

    @Override
    String getIcon() {
        return "fa-android";
    }
}
