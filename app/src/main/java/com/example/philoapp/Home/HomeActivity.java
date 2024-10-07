package com.example.philoapp.Home;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.philoapp.Music.AlbumFragment;
import com.example.philoapp.Music.MusicAdapter;
import com.example.philoapp.R;
import com.example.philoapp.Music.MusicFragment;
import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);


        EventsAdapter eventsAdapter;
        ViewPager viewPager;
        TabLayout tabLayout;

        viewPager = findViewById(R.id.viewpagerEvents);


        // setting up the adapter
        eventsAdapter = new EventsAdapter(getSupportFragmentManager());

        eventsAdapter.add(new OldEventsFragment(), "Old Events");
        eventsAdapter.add(new UpcomingEventsFragment(), "Upcoming Events");


        // Set the adapter
        viewPager.setAdapter(eventsAdapter);

        // The Page (fragment) titles will be displayed in the
        // tabLayout hence we need to  set the page viewer
        // we use the setupWithViewPager().
        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

    }
}