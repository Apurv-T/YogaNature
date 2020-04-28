package com.example.yogicnature;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class Meditation_activity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation_activity);
        Button med_song1= findViewById(R.id.button_mediSong1);

        Button med_song2= findViewById(R.id.button_mediSong2);
        Button med_song3= findViewById(R.id.button_mediSong3);
        Button med_song4= findViewById(R.id.button_mediSong4);
        Button med_song5= findViewById(R.id.button_mediSong5);
        Button med_song6= findViewById(R.id.button_mediSong6);
        Button med_song7= findViewById(R.id.button_mediSong7);

        //MediaPlayers
        final MediaPlayer HummingOfOhm = new MediaPlayer().create(getApplicationContext(), R.raw.ohm);
        final MediaPlayer forestRain = new MediaPlayer().create(this, R.raw.jungle_rain);
        final MediaPlayer meditationBowls = new MediaPlayer().create(this, R.raw.meditation_bowls);
        final MediaPlayer windChimes = new MediaPlayer().create(this, R.raw.windchimes);
        final MediaPlayer TibetanSoundBowl = new MediaPlayer().create(this, R.raw.tibetan_singing_bowl);
        final MediaPlayer spiritualJourney = new MediaPlayer().create(this, R.raw.meditate_sound);
        final MediaPlayer fluteWind = new MediaPlayer().create(this,R.raw.meditate_sound);

        //starting sound for button1
        med_song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HummingOfOhm.start();
            }
        });
        //starting sound for button2
        med_song2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                forestRain.start();
            }
        });
        //starting sound for button3
        med_song3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meditationBowls.start();
            }
        });
        //starting sound for button4
        med_song3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                windChimes.start();
            }
        });
        //starting sound for button5
        med_song5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TibetanSoundBowl.start();
            }
        });
        //starting sound for button6
        med_song6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spiritualJourney.start();
            }
        });
        //starting sound for button7
        med_song7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fluteWind.start();
            }
        });

    }
    @Override
    protected void onRestart() {
        Button med_song1= findViewById(R.id.button_mediSong1);

        Button med_song2= findViewById(R.id.button_mediSong2);
        Button med_song3= findViewById(R.id.button_mediSong3);
        Button med_song4= findViewById(R.id.button_mediSong4);
        Button med_song5= findViewById(R.id.button_mediSong5);
        Button med_song6= findViewById(R.id.button_mediSong6);
        Button med_song7= findViewById(R.id.button_mediSong7);

        //MediaPlayers
        final MediaPlayer HummingOfOhm = new MediaPlayer().create(getApplicationContext(), R.raw.ohm);
        final MediaPlayer forestRain = new MediaPlayer().create(this, R.raw.jungle_rain);
        final MediaPlayer meditationBowls = new MediaPlayer().create(this, R.raw.meditation_bowls);
        final MediaPlayer windChimes = new MediaPlayer().create(this, R.raw.windchimes);
        final MediaPlayer TibetanSoundBowl = new MediaPlayer().create(this, R.raw.tibetan_singing_bowl);
        final MediaPlayer spiritualJourney = new MediaPlayer().create(this, R.raw.meditate_sound);
        final MediaPlayer fluteWind = new MediaPlayer().create(this,R.raw.meditate_sound);

        //starting sound for button1
        med_song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HummingOfOhm.start();
            }
        });
        //starting sound for button2
        med_song2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                forestRain.start();
            }
        });
        //starting sound for button3
        med_song3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meditationBowls.start();
            }
        });
        //starting sound for button4
        med_song3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                windChimes.start();
            }
        });
        //starting sound for button5
        med_song5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TibetanSoundBowl.start();
            }
        });
        //starting sound for button6
        med_song6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spiritualJourney.start();
            }
        });
        //starting sound for button7
        med_song7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fluteWind.start();
            }
        });

        super.onRestart();
    }


    }

