package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;

public class reproductor extends AppCompatActivity {

    ImageView portada;

    TextView titulo, tiempo, duracion,autor,album,anio;
    SeekBar transcurso;
    ImageView btnRetroceder,btnPlay,btnPausa,btnAdelantar;

    MediaPlayer mediaPlayer;
    Handler handler = new Handler();
    Runnable runnable;

    String CANCION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor);

        portada = findViewById(R.id.portada);

        titulo = findViewById(R.id.titulo);
        tiempo = findViewById(R.id.tiempo);
        duracion = findViewById(R.id.duracion);
        autor = findViewById(R.id.autor);
        album = findViewById(R.id.album);
        anio = findViewById(R.id.anio);

        transcurso = findViewById(R.id.transcurso);

        btnRetroceder = findViewById(R.id.btnRetroceder);
        btnPlay = findViewById(R.id.btnPlay);
        btnPausa = findViewById(R.id.btnPausa);
        btnAdelantar = findViewById(R.id.btnAdelantar);

        CANCION = getIntent().getExtras().getString("CANCION");

        switch (CANCION){
            //ANISON
            case "drstoneop":  titulo.setText("BURNOUT SYNDROMES『Good Morning World!』（TVアニメ「Ｄｒ．ＳＴＯＮＥ」オープニングテーマ）");
                                portada.setBackground(getResources().getDrawable(R.drawable.drstone));
                                autor.setText("Autor: Burnout Syndromes");
                                album.setText("Album: Burnout Syndromes");
                                anio.setText("Año: 2020");
                                break;
            case "fireforceop":  titulo.setText("Mrs. GREEN APPLE - インフェルノ（Inferno）");
                                    portada.setBackground(getResources().getDrawable(R.drawable.enen));
                                    autor.setText("Autor: Mrs. GREEN APPLE");
                                    album.setText("Album: Attitude");
                                    anio.setText("Año: 2019");
                                    break;
            case "inuyashikiop":  titulo.setText("MAN WITH A MISSION - My Hero");
                                    portada.setBackground(getResources().getDrawable(R.drawable.inuyashiki));
                                    autor.setText("Autor: Man with a Mission");
                                    album.setText("Album: Chasing the Horizon");
                                    anio.setText("Año: 2017");
                                    break;
            case "spicexwolfop":  titulo.setText("Tabi no Tochuu ~Natsumi Kiyoura~ •Spice and Wolf");
                                    portada.setBackground(getResources().getDrawable(R.drawable.spicexwolf));
                                    autor.setText("Autor: Natsumi Kiyoura");
                                    album.setText("Album: Spice and Wolf");
                                    anio.setText("Año: 2010");
                                    break;
            case "tokyoghoulop":  titulo.setText("TK from 凛として時雨 『unravel』");
                                    portada.setBackground(getResources().getDrawable(R.drawable.tokioghoul));
                                    autor.setText("Autor: Tōru Kitajima");
                                    album.setText("Album: Fantastic Magic");
                                    anio.setText("Año: 2014");
                                    break;

            //ELECTRO
            case "astronomia":  titulo.setText("Vicetone y Tony Igy - Astronomia");
                                portada.setBackground(getResources().getDrawable(R.drawable.astro));
                                autor.setText("Autor: Vicetone, Tony Igy");
                                album.setText("Album: Astronomia");
                                anio.setText("Año: 2014");
                                break;
            case "echoes":  titulo.setText("LFZ - Echoes [NCS Release]");
                            portada.setBackground(getResources().getDrawable(R.drawable.ncsechoes));
                            autor.setText("Autor: LFZ");
                            album.setText("Album: NCS");
                            anio.setText("Año: 2017");
                            break;
            case "glitch":  titulo.setText("Martin Garrix y Julian Jordan - Glitch");
                            portada.setBackground(getResources().getDrawable(R.drawable.glitch));
                            autor.setText("Autor: Martin Garrix, Julian Jordan");
                            album.setText("Album: Glitch");
                            anio.setText("Año: 2018");
                            break;
            case "jackpot": titulo.setText("TheFatRat - Jackpot (Jackpot EP Track 1)");
                            portada.setBackground(getResources().getDrawable(R.drawable.jackpot));
                            autor.setText("Autor: TheFatRat");
                            album.setText("Album: Jackpot");
                            anio.setText("Año: 2016");
                            break;
            case "runningaway":  titulo.setText("Tobu y Marcus Mouya - Running Away [NCS Release]");
                                    portada.setBackground(getResources().getDrawable(R.drawable.ncsechoes));
                                    autor.setText("Autor: Tobu & Marcus Mouya");
                                    album.setText("Album: NCS");
                                    anio.setText("Año: 2014");
                                    break;

            //METAL
            case "trooper":  titulo.setText("Iron Maiden - The Trooper");
                portada.setBackground(getResources().getDrawable(R.drawable.trooper));
                autor.setText("Autor: Iron Maiden");
                album.setText("Album: Piece of Mind (2015 - Remaster)");
                anio.setText("Año: 2008");
                break;
            case "iwas":  titulo.setText("Kiss - I Was Made For Lovin' You");
                portada.setBackground(getResources().getDrawable(R.drawable.iwas));
                autor.setText("Autor: Kiss");
                album.setText("Album: Dynasty");
                anio.setText("Año: 1979");
                break;
            case "welcome":  titulo.setText("Guns N' Roses - Welcome To The Jungle");
                portada.setBackground(getResources().getDrawable(R.drawable.welcome));
                autor.setText("Autor: Guns N' Roses");
                album.setText("Album: Appetite for Destruction");
                anio.setText("Año: 1987");
                break;
            case "sweet": titulo.setText("Guns N' Roses - Sweet Child O' Mine");
                portada.setBackground(getResources().getDrawable(R.drawable.sweet));
                autor.setText("Autor: Guns N' Roses ");
                album.setText("Album: Appetite for Destruction");
                anio.setText("Año: 1987");
                break;
            case "metalgearrisingrevengeance":  titulo.setText("Metal Gear Rising: Revengeance OST It Has To Be This Way");
                portada.setBackground(getResources().getDrawable(R.drawable.mgr));
                autor.setText("Autor: Jamie Christopherson");
                album.setText("Album: Metal Gear Rising: Revengeance (Vocal Tracks)");
                anio.setText("Año: 2013");
                break;

            //POP
            case "ohklahoma":  titulo.setText("Jack Stauber - Oh Klahoma");
                portada.setBackground(getResources().getDrawable(R.drawable.ohklahoma));
                autor.setText("Autor: Jack Stauber");
                album.setText("Album: Pop Food");
                anio.setText("Año: 2018");
                break;
            case "musicaligera":  titulo.setText("Soda Stereo - De Música Ligera");
                portada.setBackground(getResources().getDrawable(R.drawable.sodastereo));
                autor.setText("Autor: Soda Stereo");
                album.setText("Album: Canción animal");
                anio.setText("Año: 2013");
                break;
            case "persiana":  titulo.setText("Soda Stereo - Persiana Americana");
                portada.setBackground(getResources().getDrawable(R.drawable.sodastereo));
                autor.setText("Autor: Soda Stereo");
                album.setText("Album: Signos");
                anio.setText("Año: 2012");
                break;
            case "profugos": titulo.setText("Soda Stereo - Prófugos");
                portada.setBackground(getResources().getDrawable(R.drawable.sodastereo));
                autor.setText("Autor: Soda Stereo");
                album.setText("Album: Signos");
                anio.setText("Año: 2015");
                break;
            case "signos":  titulo.setText("Soda Stereo - Signos");
                portada.setBackground(getResources().getDrawable(R.drawable.sodastereo));
                autor.setText("Autor: Soda Stereo");
                album.setText("Album: Signos");
                anio.setText("Año: 2012");
                break;

            //ROCK
            case "eltri":  titulo.setText("El Tri - Triste canción");
                portada.setBackground(getResources().getDrawable(R.drawable.eltri));
                autor.setText("Autor: El Tri");
                album.setText("Album: Simplemente");
                anio.setText("Año: 2011");
                break;
            case "ellibrodelassombras":  titulo.setText("Mägo de Oz - El libro de las sombras");
                portada.setBackground(getResources().getDrawable(R.drawable.ellibro));
                autor.setText("Autor: Mägo de Oz");
                album.setText("Album: Hechizos, pócimas y brujería");
                anio.setText("Año: 2012");
                break;
            case "cuandopiensesenvolver":  titulo.setText("Pedro Suarez-Vertiz - Cuando Pienses en Volver");
                portada.setBackground(getResources().getDrawable(R.drawable.cuandopienses));
                autor.setText("Autor: Pedro Suarez Vertiz");
                album.setText("Album: PLAY");
                anio.setText("Año: 2016");
                break;
            case "losglobosdelcielo": titulo.setText("Pedro Suarez-Vertiz - Los Globos del Cielo");
                portada.setBackground(getResources().getDrawable(R.drawable.losglobos));
                autor.setText("Autor: Pedro Suarez Vertiz");
                album.setText("Album: Pontelo en la lengua");
                anio.setText("Año: 2016");
                break;
            case "fiestapagana":  titulo.setText("Mägo de Oz- Fiesta pagana");
                portada.setBackground(getResources().getDrawable(R.drawable.mago));
                autor.setText("Autor: Mägo de Oz");
                album.setText("Album: Finisterra");
                anio.setText("Año: 2000");
                break;
        }


        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnPlay.setVisibility(View.GONE);
                btnPausa.setVisibility(View.VISIBLE);

                reproducir();
                mediaPlayer.start();
                transcurso.setMax(mediaPlayer.getDuration());
                handler.postDelayed(runnable,0);
            }
        });

        btnPausa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnPausa.setVisibility(View.GONE);
                btnPlay.setVisibility(View.VISIBLE);

                mediaPlayer.pause();
                handler.removeCallbacks(runnable);
            }
        });

        btnAdelantar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int actual = mediaPlayer.getCurrentPosition();
                int durar = mediaPlayer.getDuration();
                if(mediaPlayer.isPlaying() && durar != actual){
                    actual += 5000;
                    tiempo.setText(convertFormat(actual));
                    mediaPlayer.seekTo(actual);
                }
            }
        });

        btnRetroceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int actual = mediaPlayer.getCurrentPosition();
                if(mediaPlayer.isPlaying() && actual > 5000){
                    actual -= 5000;
                    tiempo.setText(convertFormat(actual));
                    mediaPlayer.seekTo(actual);
                }
            }
        });



    }

    public void reproducir(){
        switch (CANCION){
            //Anison
            case "drstoneop":  mediaPlayer = MediaPlayer.create(this,R.raw.drstoneop);       break;
            case "fireforceop":  mediaPlayer = MediaPlayer.create(this,R.raw.enenop);        break;
            case "inuyashikiop":  mediaPlayer = MediaPlayer.create(this,R.raw.inuyashikiop); break;
            case "spicexwolfop":  mediaPlayer = MediaPlayer.create(this,R.raw.spicexwolfop); break;
            case "tokyoghoulop":  mediaPlayer = MediaPlayer.create(this,R.raw.tokyoghoulop); break;

            //Electro
            case "astronomia":  mediaPlayer = MediaPlayer.create(this,R.raw.astronomia);       break;
            case "echoes":  mediaPlayer = MediaPlayer.create(this,R.raw.echoes);        break;
            case "glitch":  mediaPlayer = MediaPlayer.create(this,R.raw.glitch); break;
            case "jackpot":  mediaPlayer = MediaPlayer.create(this,R.raw.jackpot); break;
            case "runningaway":  mediaPlayer = MediaPlayer.create(this,R.raw.runningaway); break;

            //Metal
            case "trooper":  mediaPlayer = MediaPlayer.create(this,R.raw.thetrooper);       break;
            case "iwas":  mediaPlayer = MediaPlayer.create(this,R.raw.kiss);        break;
            case "welcome":  mediaPlayer = MediaPlayer.create(this,R.raw.welcometothejungle); break;
            case "sweet":  mediaPlayer = MediaPlayer.create(this,R.raw.sweet); break;
            case "metalgearrisingrevengeance":  mediaPlayer = MediaPlayer.create(this,R.raw.metalgearrisingrevengeance); break;

            //Pop
            case "ohklahoma":  mediaPlayer = MediaPlayer.create(this,R.raw.ohklahoma);       break;
            case "musicaligera":  mediaPlayer = MediaPlayer.create(this,R.raw.musicaligera);        break;
            case "persiana":  mediaPlayer = MediaPlayer.create(this,R.raw.persiana); break;
            case "profugos":  mediaPlayer = MediaPlayer.create(this,R.raw.profugos); break;
            case "signos":  mediaPlayer = MediaPlayer.create(this,R.raw.signos); break;

            //Rock
            case "eltri":  mediaPlayer = MediaPlayer.create(this,R.raw.eltricancion);       break;
            case "ellibrodelassombras":  mediaPlayer = MediaPlayer.create(this,R.raw.ellibrodelassombras);        break;
            case "cuandopiensesenvolver":  mediaPlayer = MediaPlayer.create(this,R.raw.cuandopiensesenvolver); break;
            case "losglobosdelcielo":  mediaPlayer = MediaPlayer.create(this,R.raw.losglobosdelcielo); break;
            case "fiestapagana":  mediaPlayer = MediaPlayer.create(this,R.raw.fiestapagana); break;
        }


        runnable = new Runnable() {
            @Override
            public void run() {
                transcurso.setProgress(mediaPlayer.getCurrentPosition());

                handler.postDelayed(this,500);
            }
        };

        int durar = mediaPlayer.getDuration();

        String Sdurar = convertFormat(durar);

        duracion.setText(Sdurar);


        transcurso.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if(b){
                    mediaPlayer.seekTo(i);
                }
                tiempo.setText(convertFormat(mediaPlayer.getCurrentPosition()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                btnPausa.setVisibility(View.GONE);
                btnPlay.setVisibility(View.VISIBLE);
                mediaPlayer.seekTo(0);
            }
        });
    }

    @SuppressLint("DefaultLocale")
    private String convertFormat(int durar){
        return String.format("%02d:%02d"
                , TimeUnit.MILLISECONDS.toMinutes(durar)
                , TimeUnit.MILLISECONDS.toSeconds(durar) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(durar)));
    }

}