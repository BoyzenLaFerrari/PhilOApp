package com.example.philoapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


import com.example.philoapp.Music.MusicActivity;
import com.example.philoapp.Pictures.PicturesActivity;
import com.example.philoapp.Videos.VideosActivity;



public class MainActivity extends AppCompatActivity {



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }

    public void Profile(View view) {
        Intent i = new Intent(getApplicationContext(), SignUp.class);
        startActivity(i);
    }

    public void Home(View view) {
        Intent i = new Intent(getApplicationContext(), MusicActivity.class);
        startActivity(i);
    }

    public void Pictures(View view) {
        Intent i = new Intent(getApplicationContext(), PicturesActivity.class);
        startActivity(i);
    }

    public void Music(View view) {
        Intent i = new Intent(getApplicationContext(), MediaPlayerActivity.class);
        startActivity(i);
    }

    public void Videos(View view) {
        Intent i = new Intent(getApplicationContext(), VideosActivity.class);
        startActivity(i);
    }
}
