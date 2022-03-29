package com.example.sft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    DrawerLayout dl;
    RelativeLayout btnHome, btnAboutus, rl_dashboard, rl_aboutus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.iv);
        dl = findViewById(R.id.dl);
        btnAboutus = findViewById(R.id.btnAboutus);
        btnHome = findViewById(R.id.btnHome);
        rl_aboutus = findViewById(R.id.rl_aboutus);
        rl_dashboard = findViewById(R.id.rl_dashboard);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl.openDrawer(Gravity.LEFT);
            }
        });

        btnAboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rl_dashboard.setVisibility(View.GONE);
                rl_aboutus.setVisibility(View.VISIBLE);
                dl.closeDrawers();


            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rl_dashboard.setVisibility(View.VISIBLE);
                rl_aboutus.setVisibility(View.GONE);
                dl.closeDrawers();

            }
        });
    }
}