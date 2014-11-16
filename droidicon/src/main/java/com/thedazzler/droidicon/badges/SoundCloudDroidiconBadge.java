package com.thedazzler.droidicon.badges;

import android.content.Context;
import android.util.AttributeSet;

import com.thedazzler.droidicon.R;

/**
 * Created by Devon Guinane on 11/16/14.
 * Droidicon
 */
public class SoundCloudDroidiconBadge extends NoCirclePremadeDroidiconBadge {
    public SoundCloudDroidiconBadge(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public SoundCloudDroidiconBadge(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SoundCloudDroidiconBadge(Context context) {
        super(context);
    }

    @Override
    int getColor() {
        return R.color.soundcloud;
    }

    @Override
    String getIcon() {
        return "esocial-soundcloud";
    }
}
