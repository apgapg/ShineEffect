package com.apg.coddu.shineeffect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView img = (ImageView) findViewById(R.id.img);
        final ImageView shine = (ImageView) findViewById(R.id.shine);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = new TranslateAnimation(0, img.getWidth()+shine.getWidth(),0, 0);
                animation.setDuration(550);
                animation.setFillAfter(false);
                animation.setInterpolator(new AccelerateDecelerateInterpolator());
                shine.startAnimation(animation);
            }
        });


    }
}
