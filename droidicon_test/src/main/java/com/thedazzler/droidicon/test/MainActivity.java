package com.thedazzler.droidicon.test;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.thedazzler.droidicon.IconicFontDrawable;
import com.thedazzler.droidicon.badges.DroidiconBadge;

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



    }


}