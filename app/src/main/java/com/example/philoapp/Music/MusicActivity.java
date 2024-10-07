package com.example.philoapp.Music;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.philoapp.R;
import com.google.android.material.tabs.TabLayout;

public class MusicActivity extends AppCompatActivity {



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_music);

         MusicAdapter musicAdapter;
         ViewPager viewPager;
         TabLayout tabLayout;

        viewPager = findViewById(R.id.viewpagerMusic);

        // setting up the adapter
        musicAdapter = new MusicAdapter(getSupportFragmentManager());

        musicAdapter.add(new AlbumFragment(), "Albums");
        musicAdapter.add(new MusicFragment(), "Songs");


        // Set the adapter
        viewPager.setAdapter(musicAdapter);

        // The Page (fragment) titles will be displayed in the
        // tabLayout hence we need to  set the page viewer
        // we use the setupWithViewPager().
        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

    }
}