package com.thedazzler.droidicon.test;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.thedazzler.droidicon.IconicFontDrawable;

import android.app.Activity;
import static android.os.Build.VERSION.SDK_INT;
import static android.os.Build.VERSION_CODES.JELLY_BEAN;

public class MainActivity extends Activity
{
    private View mIconView, mIconView2, lone1, lone2, lone3, lone4;

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

        if (SDK_INT < JELLY_BEAN) {
            mIconView.setBackgroundDrawable(iconicFontDrawable);
            mIconView2.setBackgroundDrawable(randomIconicFontDrawable);
            lone1.setBackgroundDrawable(lone1Drawable);
            lone2.setBackgroundDrawable(lone2Drawable);
            lone3.setBackgroundDrawable(lone3Drawable);
            lone4.setBackgroundDrawable(lone4Drawable);
        } else {
            mIconView.setBackground(iconicFontDrawable);
            mIconView2.setBackground(randomIconicFontDrawable);
            lone1.setBackground(lone1Drawable);
            lone2.setBackground(lone2Drawable);
            lone3.setBackground(lone3Drawable);
            lone4.setBackground(lone4Drawable);
        }

    }


}