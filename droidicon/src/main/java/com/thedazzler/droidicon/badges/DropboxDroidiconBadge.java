package com.thedazzler.droidicon.badges;

import android.content.Context;
import android.util.AttributeSet;

import com.thedazzler.droidicon.R;

/**
 * Created by Devon Guinane on 11/16/14.
 * Droidicon
 */
public class DropboxDroidiconBadge extends NoCirclePremadeDroidiconBadge {
    public DropboxDroidiconBadge(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public DropboxDroidiconBadge(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DropboxDroidiconBadge(Context context) {
        super(context);
    }

    @Override
    int getColor() {
        return R.color.dropbox;
    }

    @Override
    String getIcon() {
        return "esocial-dropbox";
    }
}
