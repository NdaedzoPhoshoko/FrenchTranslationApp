package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //declaring view elements
    private TextView theTextView, frenchAppTextView; //headings
    private Button blackBtn, purpleBtn, greenBtn, redBtn; //buttons

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiating view elements
        theTextView = findViewById(R.id.THE_TextView);
        frenchAppTextView = findViewById(R.id.FRENCHAPP_TextView);
        blackBtn = findViewById(R.id.black_Btn);
        purpleBtn = findViewById(R.id.purple_Btn);
        greenBtn = findViewById(R.id.green_Btn);
        redBtn = findViewById(R.id.red_Btn);

        blackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSong(R.raw.black);
            }
        });

        purpleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSong(R.raw.purple);
            }
        });

        greenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSong(R.raw.green);
            }
        });

        redBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSong(R.raw.red);
            }
        });
    }

    //method for playing song for click button
    public void playSong(int i)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), i);
        mediaPlayer.start();//start to play requested song
    }
}