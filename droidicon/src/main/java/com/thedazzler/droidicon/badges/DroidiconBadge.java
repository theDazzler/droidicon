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

public class DroidiconBadge extends FrameLayout
{
    private static final float DEFAULT_ICON_SIZE = Utils.convertDpToPixel(80.0f);
    private static final double PADDING_PERCENTAGE = .975;
    //small = 20
    //28
    //48
    //96
    //192
    View view_icon;
    IconicFontDrawable iconicFontDrawable;
    private String icon;
    private int bgColor;
    private int iconColor;
    private boolean drawContour;
    private int contourWidth;
    private int alpha;
    private float icon_size;
    private float icon_padding;
    private int contourColor;

    private LinearLayout container;
    private Context context;


    public DroidiconBadge(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        this.context = context;
        initialise(attrs);
    }

    public DroidiconBadge(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        this.context = context;
        initialise(attrs);
    }

    public DroidiconBadge(Context context)
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
            bgColor = a.getColor(R.styleable.DroidiconBadge_db_bg_color, 0);
            iconColor = a.getColor(R.styleable.DroidiconBadge_db_icon_color, 0);
            contourColor = a.getColor(R.styleable.DroidiconBadge_db_contour_color, 0);
            contourWidth = a.getInt(R.styleable.DroidiconBadge_db_contour_width, 5);
            drawContour = a.getBoolean(R.styleable.DroidiconBadge_db_draw_contour, false);
            alpha = a.getInt(R.styleable.DroidiconBadge_db_alpha, 255);
            icon = a.getString(R.styleable.DroidiconBadge_db_icon);
            icon_size = a.getDimension(R.styleable.DroidiconBadge_db_size, DEFAULT_ICON_SIZE);


            icon_size = Utils.convertPixelsToDp((int) icon_size, context);

            icon_padding = a.getDimension(R.styleable.DroidiconBadge_db_icon_padding, (int)(icon_size * PADDING_PERCENTAGE));
            //icon_padding = Utils.convertPixelsToDp((int)icon_padding, context);





        }
        finally
        {
            a.recycle();
        }



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
        bgShape.setColor(bgColor);

        iconicFontDrawable = new IconicFontDrawable(this.context);
        iconicFontDrawable.setIcon(icon);
        iconicFontDrawable.setIconColor(iconColor);
        iconicFontDrawable.setIconPadding((int) icon_padding);
        iconicFontDrawable.setContourColor(contourColor);
        iconicFontDrawable.setContour(contourColor, contourWidth);
        iconicFontDrawable.drawContour(drawContour);
        iconicFontDrawable.setAlpha(alpha);

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
