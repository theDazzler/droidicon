package com.thedazzler.droidicon.badges;

import android.content.Context;
import android.util.AttributeSet;

import com.thedazzler.droidicon.R;

/**
 * Created by Devon Guinane on 11/16/14.
 * Droidicon
 */
public class PinterestDroidiconBadge extends PremadeDroidiconBadge {
    public PinterestDroidiconBadge(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public PinterestDroidiconBadge(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PinterestDroidiconBadge(Context context) {
        super(context);
    }

    @Override
    int getDefaultColor() {
        return R.color.pinterest;
    }

    @Override
    String getIcon() {
        return "esocial-c-pinterest";
    }
}
