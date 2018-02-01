package com.example.a665983.soundapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.media.MediaPlayer;

protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer piano = Mediaplayer.create(getAplicationContent(),R.raw.piano);
        piano.start();
        }


    public void message(View view){
        Intent intent = new Intent(pakageContent:this, secondpage.class);
        startActivity(intent);
}

        public void email(View view){
            Intent emailIntent = new Intent (Intent.ACTION_SEND);
            //Bellow adds to the email to me
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA _EMAIL,new String{}{"neupaneanuj1@gmail.com"));//recipients
        emailIntent.putExtra(Intent.EXTRA _SUBJECT,  value: "Sound APP");
        emailIntent.putExtra(Intent.EXTRA _TEXT, value "listen to my voice");

        startActivity(emailIntent);


    }
        }