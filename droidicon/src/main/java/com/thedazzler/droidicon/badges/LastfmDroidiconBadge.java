package com.thedazzler.droidicon.badges;

import android.content.Context;
import android.util.AttributeSet;

import com.thedazzler.droidicon.R;

/**
 * Created by Devon Guinane on 11/16/14.
 * Droidicon
 */
public class LastfmDroidiconBadge extends PremadeDroidiconBadge {
    public LastfmDroidiconBadge(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public LastfmDroidiconBadge(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LastfmDroidiconBadge(Context context) {
        super(context);
    }

    @Override
    int getDefaultColor() {
        return R.color.lastfm;
    }

    @Override
    String getIcon() {
        return "esocial-c-lastfm";
    }
}
