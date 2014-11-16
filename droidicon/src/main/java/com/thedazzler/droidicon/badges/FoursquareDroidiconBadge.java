package com.thedazzler.droidicon.badges;

import android.content.Context;
import android.util.AttributeSet;

import com.thedazzler.droidicon.R;

/**
 * Created by Devon Guinane on 11/16/14.
 * Droidicon
 */
public class FoursquareDroidiconBadge extends NoCirclePremadeDroidiconBadge {
    public FoursquareDroidiconBadge(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public FoursquareDroidiconBadge(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FoursquareDroidiconBadge(Context context) {
        super(context);
    }

    @Override
    int getColor() {
        return R.color.foursquare;
    }

    @Override
    String getIcon() {
        return "fa-foursquare";
    }
}
