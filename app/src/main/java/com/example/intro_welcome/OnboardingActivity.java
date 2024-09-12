package com.example.intro_welcome;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.viewpager2.widget.ViewPager2;

public class OnboardingActivity extends AppCompatActivity {

    private ViewPager2 viewpager;
    private ViewPagerAdapter welcomePagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        viewpager = findViewById(R.id.viewPager);
        welcomePagerAdapter  = new ViewPagerAdapter(this);
        viewpager.setAdapter(welcomePagerAdapter);
    }
}
