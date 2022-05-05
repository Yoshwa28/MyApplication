package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class cat_metal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_metal);
    }

    @SuppressLint("NonConstantResourceId")
    public void reproducirMusica(View view) {
        Intent intent = new Intent(cat_metal.this, reproductor.class);
        switch (view.getId()){
            case R.id.metal1: intent.putExtra("CANCION","trooper");        break;
            case R.id.metal2: intent.putExtra("CANCION","iwas");            break;
            case R.id.metal3: intent.putExtra("CANCION","welcome");            break;
            case R.id.metal4: intent.putExtra("CANCION","sweet");           break;
            case R.id.metal5: intent.putExtra("CANCION","metalgearrisingrevengeance");       break;
        }
        startActivity(intent);
    }
}