package com.thedazzler.droidicon.badges;

import android.content.Context;
import android.util.AttributeSet;

import com.thedazzler.droidicon.R;

/**
 * Created by Devon Guinane on 11/16/14.
 * Droidicon
 */
public class TwitterDroidiconBadge extends PremadeDroidiconBadge {
    public TwitterDroidiconBadge(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public TwitterDroidiconBadge(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TwitterDroidiconBadge(Context context) {
        super(context);
    }

    @Override
    int getDefaultColor() {
        return R.color.twitter_blue;
    }

    @Override
    String getIcon() {
        return "esocial-c-twitter";
    }
}
