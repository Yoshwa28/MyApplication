package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class pre_main_activity extends AppCompatActivity {
    Button btn_prebutton;
    MediaPlayer m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_main);
        m = MediaPlayer.create(this,R.raw.music);
        m.setLooping(true);
        m.start();
        btn_prebutton = findViewById(R.id.pre_button);
        btn_prebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m.stop();
                MediaPlayer mp = MediaPlayer.create(pre_main_activity.this, R.raw.prebutton);
                mp.start();
                Intent intent = new Intent(pre_main_activity.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
}