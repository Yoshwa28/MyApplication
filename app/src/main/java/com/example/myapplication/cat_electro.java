package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class cat_electro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_electro);
    }

    @SuppressLint("NonConstantResourceId")
    public void reproducirMusica(View view) {
        Intent intent = new Intent(cat_electro.this, reproductor.class);
        switch (view.getId()){
            case R.id.electro1: intent.putExtra("CANCION","astronomia");        break;
            case R.id.electro2: intent.putExtra("CANCION","echoes");            break;
            case R.id.electro3: intent.putExtra("CANCION","glitch");            break;
            case R.id.electro4: intent.putExtra("CANCION","jackpot");           break;
            case R.id.electro5: intent.putExtra("CANCION","runningaway");       break;
        }
        startActivity(intent);
    }

}