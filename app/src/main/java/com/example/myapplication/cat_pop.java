package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class cat_pop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_pop);
    }

    @SuppressLint("NonConstantResourceId")
    public void reproducirMusica(View view) {
        Intent intent = new Intent(cat_pop.this, reproductor.class);
        switch (view.getId()){
            case R.id.pop1: intent.putExtra("CANCION","ohklahoma");        break;
            case R.id.pop2: intent.putExtra("CANCION","musicaligera");            break;
            case R.id.pop3: intent.putExtra("CANCION","persiana");            break;
            case R.id.pop4: intent.putExtra("CANCION","profugos");           break;
            case R.id.pop5: intent.putExtra("CANCION","signos");       break;
        }
        startActivity(intent);
    }
}