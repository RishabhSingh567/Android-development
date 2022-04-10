package com.mxorg.mxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private Button b2;
    private Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.au);
        b2=(Button)findViewById(R.id.cs);
        b3=(Button)findViewById(R.id.gl);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openActivity2();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openActivity3();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openActivity4();
            }
        });
    }
    public void openActivity2(){
        Intent intent = new Intent(this, second.class);
        startActivity(intent);
    }
    public void openActivity3(){
        Intent intent = new Intent(this, third.class);
        startActivity(intent);
    }
    public void openActivity4(){
        Intent intent = new Intent(this, fourth.class);
        startActivity(intent);
    }
}
