package com.example.superheroes6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class seatch extends AppCompatActivity {
    ImageButton imageButton;
    ImageButton imageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seatch);
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensupergirlactivity();
            }
        });
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensupermanactivity();
            }
        });
    }

public void opensupermanactivity(){
        Intent intent = new Intent(this,supermanactivity.class);
        startActivity(intent);
}
public void opensupergirlactivity(){
        Intent intent = new Intent(this,supergirlactivity.class);
        startActivity(intent);
}

}
