package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import pl.droidsonroids.gif.GifImageButton;


public class MainActivity extends AppCompatActivity {

    GifImageButton btn_rock, btn_anime, btn_pop, btn_electro, btn_metal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_pop = findViewById(R.id.btn_pop);
        btn_anime = findViewById(R.id.btn_anime);
        btn_electro = findViewById(R.id.btn_electro);
        btn_rock = findViewById(R.id.btn_rock);
        btn_metal = findViewById(R.id.btn_metal);

        //categoria pop
        btn_pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.buttonone);
                mp.start();
                Intent intent = new Intent(MainActivity.this,cat_pop.class);
                startActivity(intent);

            }
        });

        //categoria rock
        btn_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.buttonone);
                mp.start();
                Intent intent = new Intent(MainActivity.this,rock_cat.class);
                startActivity(intent);

            }
        });

        //categoria metal
        btn_metal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.buttonone);
                mp.start();
                Intent intent = new Intent(MainActivity.this,cat_metal.class);
                startActivity(intent);

            }
        });

        //categoria electro
        btn_electro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.buttonone);
                mp.start();
                Intent intent = new Intent(MainActivity.this,cat_electro.class);
                startActivity(intent);

            }
        });
        //categoria anime
        btn_anime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.buttonone);
                mp.start();
                Intent intent = new Intent(MainActivity.this,cat_anime.class);
                startActivity(intent);

            }
        });
    }

}