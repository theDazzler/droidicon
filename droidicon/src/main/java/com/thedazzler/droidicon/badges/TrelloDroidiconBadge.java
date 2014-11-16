package com.thedazzler.droidicon.badges;

import android.content.Context;
import android.util.AttributeSet;

import com.thedazzler.droidicon.R;

/**
 * Created by Devon Guinane on 11/16/14.
 * Droidicon
 */
public class TrelloDroidiconBadge extends NoCirclePremadeDroidiconBadge {
    public TrelloDroidiconBadge(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public TrelloDroidiconBadge(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TrelloDroidiconBadge(Context context) {
        super(context);
    }

    @Override
    int getColor() {
        return R.color.trello;
    }

    @Override
    String getIcon() {
        return "fa-trello";
    }
}
