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
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;


import static android.os.Build.VERSION.SDK_INT;
import static android.os.Build.VERSION_CODES.JELLY_BEAN;

public abstract class NoCirclePremadeDroidiconBadge extends FrameLayout
{
    private static final float DEFAULT_ICON_SIZE = Utils.convertDpToPixel(80.0f);
    private static final double PADDING_PERCENTAGE = .975;

    View view_icon;
    IconicFontDrawable iconicFontDrawable;
    private String icon;
    private int bgColor;
    private int iconColor;

    private float icon_size;
    private float icon_padding;


    private LinearLayout container;
    private Context context;

    abstract int getColor();
    abstract String getIcon();


    public NoCirclePremadeDroidiconBadge(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        this.context = context;
        initialise(attrs);
    }

    public NoCirclePremadeDroidiconBadge(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        this.context = context;
        initialise(attrs);
    }

    public NoCirclePremadeDroidiconBadge(Context context)
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

        View v = inflator.inflate(R.layout.badge, null, false);

        container = (LinearLayout) v.findViewById(R.id.container);

        view_icon = v.findViewById(R.id.view_icon);



        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.DroidiconBadge);

        try
        {

            icon_size = a.getDimension(R.styleable.DroidiconBadge_db_size, DEFAULT_ICON_SIZE);



            //icon_padding = Utils.convertPixelsToDp((int)icon_padding, context);





        }
        finally
        {
            a.recycle();
        }


        bgColor = getColor();
        iconColor = R.color.white;
        icon = getIcon();

        icon_size = Utils.convertPixelsToDp((int) icon_size, context);

        icon_padding = a.getDimension(R.styleable.DroidiconBadge_db_icon_padding, (int)(icon_size * PADDING_PERCENTAGE));


        float scale = getResources().getDisplayMetrics().density;

        int padding = 4;

        int paddingPX = (int)((padding * scale) + 0.5);

        //convert image size to pixels
        int imageSizeWidthPX = (int)((icon_size * scale) + 0.5);
        int imageSizeHeightPX = (int)((icon_size * scale) + 0.5);

        container.setLayoutParams(new LinearLayout.LayoutParams(imageSizeWidthPX, imageSizeHeightPX));
        //container.setPadding(paddingPX, paddingPX, paddingPX, paddingPX);

        //set placeholder image

        //LinearLayout test = (LinearLayout) v.findViewById(R.layout.badge);

        //test.setBackgroundColor(bgColor);



        container.setBackgroundResource(R.drawable.badge);
        GradientDrawable bgShape = (GradientDrawable)container.getBackground();
        bgShape.setColor(getResources().getColor(bgColor));

        iconicFontDrawable = new IconicFontDrawable(this.context);
        iconicFontDrawable.setIcon(icon);
        iconicFontDrawable.setIconColor(getResources().getColor(iconColor));
        iconicFontDrawable.setIconPadding((int) icon_padding);

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
