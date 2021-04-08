package com.example.superheroes6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class dashboard extends AppCompatActivity {

    ImageView img;
    boolean supermanDisplaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        img = findViewById(R.id.img);
        img.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(supermanDisplaying){
                    img.setImageResource(R.drawable.supergirl1);
                    supermanDisplaying = false;
                }else {
                    img.setImageResource(R.drawable.superman);
                    supermanDisplaying = true;
                }
                return false;
            }
        });
    }
}