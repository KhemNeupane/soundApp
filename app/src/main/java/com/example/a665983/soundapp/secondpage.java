package com.example.a665983.soundapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secondpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);

        MediaPlayer guitarSound = MediaPlayer.create(this, R.raw.guitar); //get sound ready
        guitarSound.start(); //plays sound
    }

    public void sound(View view){

    }

    public void website(View view ){
        Uri webpage = Uri.parse("http://www.google.com");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
    }
}
