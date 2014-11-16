package com.thedazzler.droidicon.badges;

import android.content.Context;
import android.util.AttributeSet;

import com.thedazzler.droidicon.R;

/**
 * Created by Devon Guinane on 11/16/14.
 * Droidicon
 */
public class SkypeDroidiconBadge extends PremadeDroidiconBadge {
    public SkypeDroidiconBadge(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public SkypeDroidiconBadge(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SkypeDroidiconBadge(Context context) {
        super(context);
    }

    @Override
    int getDefaultColor() {
        return R.color.skype;
    }

    @Override
    String getIcon() {
        return "esocial-c-skype";
    }
}
