package com.mxorg.mxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class third extends AppCompatActivity {
    Button bt1;
    Button bt2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        bt1=(Button)findViewById(R.id.ap);
        bt2=(Button)findViewById(R.id.bew);
        final MediaPlayer mp2 = MediaPlayer.create(this,R.raw.bew);
        final MediaPlayer mp1 = MediaPlayer.create(this,R.raw.amp);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp2.isPlaying()){
                    mp2.stop();
                }
                mp1.start();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp1.isPlaying()){
                    mp1.stop();
                }
                mp2.start();
            }
        });







    }
}