package com.example.philoapp.Logins;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.example.philoapp.Music.AlbumFragment;
import com.example.philoapp.Music.MusicAdapter;
import com.example.philoapp.Music.MusicFragment;
import com.example.philoapp.R;
import com.google.android.material.tabs.TabLayout;

public class Logins extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_logins);

        LoginsAdapter loginsAdapter;
        ViewPager viewPager;
        TabLayout tabLayout;

        viewPager = findViewById(R.id.viewpagerLogins);

        // setting up the adapter
        loginsAdapter = new LoginsAdapter(getSupportFragmentManager());

        loginsAdapter.add(new RegisterFragment(), "Register");
        loginsAdapter.add(new LoginFragment(), "Login");


        // Set the adapter
        viewPager.setAdapter(loginsAdapter);

        // The Page (fragment) titles will be displayed in the
        // tabLayout hence we need to  set the page viewer
        // we use the setupWithViewPager().
        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);


    }
}