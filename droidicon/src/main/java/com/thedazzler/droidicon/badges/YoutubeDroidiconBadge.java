package com.thedazzler.droidicon.badges;

import android.content.Context;
import android.util.AttributeSet;

import com.thedazzler.droidicon.R;

/**
 * Created by Devon Guinane on 11/16/14.
 * Droidicon
 */
public class YoutubeDroidiconBadge extends NoCirclePremadeDroidiconBadge {
    public YoutubeDroidiconBadge(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public YoutubeDroidiconBadge(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public YoutubeDroidiconBadge(Context context) {
        super(context);
    }

    @Override
    int getColor() {
        return R.color.youtube;
    }

    @Override
    String getIcon() {
        return "fa-youtube";
    }
}
