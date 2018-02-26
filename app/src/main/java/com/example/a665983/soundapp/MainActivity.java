package com.example.a665983.soundapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {

protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
}



    public void sound(View view){
        Intent intent = new Intent(this, secondpage.class);
        startActivity(intent);
        MediaPlayer guitar = MediaPlayer.create(getApplicationContext(), R.raw.guitar);
        guitar.start();
}

        public void email(View view){
            Intent emailIntent = new Intent (Intent.ACTION_SEND);
            //Bellow adds to the email to me
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{"neupaneanuj1@gmail.com"});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Sound APP");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "listen to my voice");

        startActivity(emailIntent);


    }
}