package com.thedazzler.droidicon.badges;

import android.content.Context;
import android.util.AttributeSet;

import com.thedazzler.droidicon.R;

/**
 * Created by Devon Guinane on 11/16/14.
 * Droidicon
 */
public class SpotifyDroidiconBadge extends PremadeDroidiconBadge {
    public SpotifyDroidiconBadge(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public SpotifyDroidiconBadge(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SpotifyDroidiconBadge(Context context) {
        super(context);
    }

    @Override
    int getDefaultColor() {
        return R.color.spotify;
    }

    @Override
    String getIcon() {
        return "esocial-c-spotify";
    }
}
