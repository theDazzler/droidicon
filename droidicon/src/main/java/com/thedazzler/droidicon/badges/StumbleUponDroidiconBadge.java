package com.thedazzler.droidicon.badges;

import android.content.Context;
import android.util.AttributeSet;

import com.thedazzler.droidicon.R;

/**
 * Created by Devon Guinane on 11/16/14.
 * Droidicon
 */
public class StumbleUponDroidiconBadge extends PremadeDroidiconBadge {
    public StumbleUponDroidiconBadge(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public StumbleUponDroidiconBadge(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StumbleUponDroidiconBadge(Context context) {
        super(context);
    }

    @Override
    int getDefaultColor() {
        return R.color.stumbleupon;
    }

    @Override
    String getIcon() {
        return "esocial-c-stumbleupon";
    }
}
