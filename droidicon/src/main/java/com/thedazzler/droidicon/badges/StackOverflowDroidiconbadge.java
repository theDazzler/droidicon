package com.thedazzler.droidicon.badges;

import android.content.Context;
import android.util.AttributeSet;

import com.thedazzler.droidicon.R;

/**
 * Created by Devon Guinane on 11/16/14.
 * Droidicon
 */
public class StackOverflowDroidiconbadge extends NoCirclePremadeDroidiconBadge {
    public StackOverflowDroidiconbadge(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public StackOverflowDroidiconbadge(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StackOverflowDroidiconbadge(Context context) {
        super(context);
    }

    @Override
    int getColor() {
        return R.color.stackoverflow;
    }

    @Override
    String getIcon() {
        return "fa-stack-overflow";
    }
}
