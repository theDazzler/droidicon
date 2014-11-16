package com.thedazzler.droidicon.badges;

import com.thedazzler.droidicon.IconicFontDrawable;
import com.thedazzler.droidicon.R;
import com.thedazzler.droidicon.util.Utils;

/**
 * Created by Devon Guinane on 11/15/14.
 * Droidicon
 */

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;


import static android.os.Build.VERSION.SDK_INT;
import static android.os.Build.VERSION_CODES.JELLY_BEAN;

public abstract class PremadeDroidiconBadge extends FrameLayout
{
    private  float DEFAULT_ICON_SIZE = Utils.convertDpToPixel(80.0f);

    View view_icon;
    IconicFontDrawable iconicFontDrawable;

    private float icon_size;
    private LinearLayout container;
    private Context context;

    abstract int getDefaultColor();
    abstract String getIcon();



    public PremadeDroidiconBadge(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        this.context = context;
        initialise(attrs);
    }

    public PremadeDroidiconBadge(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        this.context = context;
        initialise(attrs);
    }

    public PremadeDroidiconBadge(Context context)
    {
        super(context);
        this.context = context;
        initialise(null);
    }

    private void initialise( AttributeSet attrs )
    {

        if(this.isInEditMode())
            return;

        LayoutInflater inflator = (LayoutInflater)getContext().getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);

        View v = inflator.inflate(R.layout.premade_badge, null, false);

        container = (LinearLayout) v.findViewById(R.id.container);

        view_icon = v.findViewById(R.id.view_icon);

        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.DroidiconBadge);

        try
        {

            //icon = "esocial-c-facebook";
            icon_size = a.getDimension(R.styleable.DroidiconBadge_db_size, DEFAULT_ICON_SIZE);
            icon_size = Utils.convertPixelsToDp((int) icon_size, context);


        }
        finally
        {
            a.recycle();
        }

        float scale = getResources().getDisplayMetrics().density;

        //convert image size to pixels
        int imageSizeWidthPX = (int)((icon_size * scale) + 0.5);
        int imageSizeHeightPX = (int)((icon_size * scale) + 0.5);

        view_icon.setLayoutParams(new LinearLayout.LayoutParams(imageSizeWidthPX, imageSizeHeightPX));

        iconicFontDrawable = new IconicFontDrawable(this.context);
        iconicFontDrawable.setIcon(getIcon());
        iconicFontDrawable.setIconColor(getResources().getColor(getDefaultColor()));

        if (SDK_INT < JELLY_BEAN) {
            view_icon.setBackgroundDrawable(iconicFontDrawable);
        } else {
            view_icon.setBackground(iconicFontDrawable);
        }


        this.addView(v);
    }

    public IconicFontDrawable getIconicFontDrawable()
    {
        return this.iconicFontDrawable;
    }


}
