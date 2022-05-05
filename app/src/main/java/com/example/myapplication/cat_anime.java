package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cat_anime extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_anime);
    }

    @SuppressLint("NonConstantResourceId")
    public void reproducirMusica(View view) {
        Intent intent = new Intent(cat_anime.this, reproductor.class);
        switch (view.getId()){
            case R.id.anison1: intent.putExtra("CANCION","drstoneop");      break;
            case R.id.anison2: intent.putExtra("CANCION","fireforceop");    break;
            case R.id.anison3: intent.putExtra("CANCION","inuyashikiop");   break;
            case R.id.anison4: intent.putExtra("CANCION","spicexwolfop");   break;
            case R.id.anison5: intent.putExtra("CANCION","tokyoghoulop");   break;
        }
        startActivity(intent);
    }
}