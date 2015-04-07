package com.thedazzler.droidicon.test;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.thedazzler.droidicon.IconicFontDrawable;

import android.app.Activity;

import com.thedazzler.droidicon.badges.DribbleDroidiconBadge;
import com.thedazzler.droidicon.badges.DroidiconBadge;
import com.thedazzler.droidicon.typeface.CustomTypefaceHolder;
import com.thedazzler.droidicon.typeface.TypefaceManager;

import java.util.HashMap;
import java.util.Map;

import static android.os.Build.VERSION.SDK_INT;
import static android.os.Build.VERSION_CODES.JELLY_BEAN;

public class MainActivity extends Activity
{
    private View mIconView, mIconView2, lone1, lone2, lone3, lone4, custom1, custom2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mIconView = findViewById(R.id.contour_icon);
        mIconView2 = findViewById(R.id.random_icon);
        lone1 = findViewById(R.id.lone1);
        lone2 = findViewById(R.id.lone2);
        lone3 = findViewById(R.id.lone3);
        lone4 = findViewById(R.id.lone4);
        custom1 = findViewById(R.id.custom1);
        custom2 = findViewById(R.id.custom2);

        DroidiconBadge badger = (DroidiconBadge) findViewById(R.id.dribble);
        badger.setBackgroundColor(getResources().getColor(R.color.spotify));
        badger.setContourColor(getResources().getColor(R.color.twitter_blue));




        IconicFontDrawable iconicFontDrawable = new IconicFontDrawable(this.getApplicationContext());
        iconicFontDrawable.setIcon("fa-twitch");
        iconicFontDrawable.setIconColor(getResources().getColor(R.color.twitter_bg));
        iconicFontDrawable.setContourColor(getResources().getColor(R.color.twitter_blue));
        iconicFontDrawable.setContourWidth(5);
        iconicFontDrawable.drawContour(true);

        IconicFontDrawable randomIconicFontDrawable = new IconicFontDrawable(this.getApplicationContext());
        randomIconicFontDrawable.setIcon("fa-question-circle");
        randomIconicFontDrawable.setIconColor(getResources().getColor(R.color.amethyst));
        randomIconicFontDrawable.setContourColor(getResources().getColor(R.color.sunflower));
        randomIconicFontDrawable.setContourWidth(5);
        randomIconicFontDrawable.drawContour(true);

        IconicFontDrawable lone1Drawable = new IconicFontDrawable(this.getApplicationContext());
        lone1Drawable.setIcon("iconic-article");
        lone1Drawable.setIconColor(Utils.randomColor());
        lone1Drawable.setContourColor(Utils.randomColor());
        lone1Drawable.setContourWidth(5);
        lone1Drawable.drawContour(true);

        IconicFontDrawable lone2Drawable = new IconicFontDrawable(this.getApplicationContext());
        lone2Drawable.setIcon("esocial-facebook");
        lone2Drawable.setIconColor(Utils.randomColor());
        lone2Drawable.setContourColor(Utils.randomColor());
        lone2Drawable.setContourWidth(5);
        lone2Drawable.drawContour(true);

        IconicFontDrawable lone3Drawable = new IconicFontDrawable(this.getApplicationContext());
        lone3Drawable.setIcon("esocial-spotify");
        lone3Drawable.setIconColor(Utils.randomColor());
        lone3Drawable.setContourColor(Utils.randomColor());
        lone3Drawable.setContourWidth(5);
        lone3Drawable.drawContour(true);

        IconicFontDrawable lone4Drawable = new IconicFontDrawable(this.getApplicationContext());
        lone4Drawable.setIcon("esocial-instagram");
        lone4Drawable.setIconColor(Utils.randomColor());
        lone4Drawable.setContourColor(Utils.randomColor());
        lone4Drawable.setContourWidth(5);
        lone4Drawable.drawContour(true);



        //Custom fonts
        Map<String, Integer> customMap = new HashMap<String, Integer>();
        customMap.put("custom-1", 0xe600);
        customMap.put("custom-2", 0xe601);
        customMap.put("custom-3", 0xe602);
        customMap.put("custom-4", 0xe603);
        customMap.put("custom-5", 0xe604);
        customMap.put("custom-6", 0xe605);
        customMap.put("custom-7", 0xe606);
        CustomTypefaceHolder customTypefaceHolder = new CustomTypefaceHolder("custom", R.raw.custom, customMap);
        TypefaceManager.getInstance().addNewTypefaceHolder(customTypefaceHolder);

        IconicFontDrawable customDrawable1 = new IconicFontDrawable(this.getApplicationContext());
        customDrawable1.setIcon("custom-1");
        customDrawable1.setIconColor(Utils.randomColor());

        IconicFontDrawable customDrawable2 = new IconicFontDrawable(this.getApplicationContext());
        customDrawable2.setIcon("custom-4");
        customDrawable2.setIconColor(Utils.randomColor());

        if (SDK_INT < JELLY_BEAN) {
            mIconView.setBackgroundDrawable(iconicFontDrawable);
            mIconView2.setBackgroundDrawable(randomIconicFontDrawable);
            lone1.setBackgroundDrawable(lone1Drawable);
            lone2.setBackgroundDrawable(lone2Drawable);
            lone3.setBackgroundDrawable(lone3Drawable);
            lone4.setBackgroundDrawable(lone4Drawable);
            custom1.setBackgroundDrawable(customDrawable1);
            custom2.setBackgroundDrawable(customDrawable2);
        } else {
            mIconView.setBackground(iconicFontDrawable);
            mIconView2.setBackground(randomIconicFontDrawable);
            lone1.setBackground(lone1Drawable);
            lone2.setBackground(lone2Drawable);
            lone3.setBackground(lone3Drawable);
            lone4.setBackground(lone4Drawable);
            custom1.setBackground(customDrawable1);
            custom2.setBackground(customDrawable2);
        }

    }


}