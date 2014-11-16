package com.thedazzler.droidicon.badges;

import com.thedazzler.droidicon.R;

/**
 * Created by Devon Guinane on 11/15/14.
 * Droidicon
 */

import android.content.Context;
import android.util.AttributeSet;


public class FacebookDroidiconBadge extends PremadeDroidiconBadge
{

    @Override
    int getDefaultColor() {
        return R.color.facebook;
    }

    @Override
    String getIcon() {
        return "esocial-c-facebook";
    }

    public FacebookDroidiconBadge(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
    }

    public FacebookDroidiconBadge(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public FacebookDroidiconBadge(Context context)
    {
        super(context);
    }





}
