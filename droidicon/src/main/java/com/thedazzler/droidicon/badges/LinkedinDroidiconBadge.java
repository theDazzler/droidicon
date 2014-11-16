package com.thedazzler.droidicon.badges;

import android.content.Context;
import android.util.AttributeSet;

import com.thedazzler.droidicon.R;

/**
 * Created by Devon Guinane on 11/16/14.
 * Droidicon
 */
public class LinkedinDroidiconBadge extends PremadeDroidiconBadge {
    public LinkedinDroidiconBadge(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public LinkedinDroidiconBadge(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LinkedinDroidiconBadge(Context context) {
        super(context);
    }

    @Override
    int getDefaultColor() {
        return R.color.linkedin;
    }

    @Override
    String getIcon() {
        return "esocial-c-linkedin";
    }
}
