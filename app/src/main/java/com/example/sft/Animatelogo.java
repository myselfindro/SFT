package com.example.sft;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ImageView;

public class Animatelogo extends AppCompatActivity {

    ImageView imglogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animatelogo);
        imglogo = findViewById(R.id.imglogo);
        Animation a = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.progress_anim);
        a.setDuration(2000);
        imglogo.startAnimation(a);

        a.setInterpolator(new Interpolator() {
            private final int frameCount = 20;

            @Override
            public float getInterpolation(float input) {
                return (float)Math.floor(input*frameCount)/frameCount;
            }
        });

        int secondsDelayed = 1;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent intent = new Intent(Animatelogo.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, secondsDelayed * 1000);
    }
}