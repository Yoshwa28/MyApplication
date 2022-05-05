package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class rock_cat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_cat);
    }

    @SuppressLint("NonConstantResourceId")
    public void reproducirMusica(View view) {
        Intent intent = new Intent(rock_cat.this, reproductor.class);
        switch (view.getId()){
            case R.id.rock1: intent.putExtra("CANCION","eltri");        break;
            case R.id.rock2: intent.putExtra("CANCION","ellibrodelassombras");            break;
            case R.id.rock3: intent.putExtra("CANCION","cuandopiensesenvolver");            break;
            case R.id.rock4: intent.putExtra("CANCION","losglobosdelcielo");           break;
            case R.id.rock5: intent.putExtra("CANCION","fiestapagana");       break;
        }
        startActivity(intent);
    }
}