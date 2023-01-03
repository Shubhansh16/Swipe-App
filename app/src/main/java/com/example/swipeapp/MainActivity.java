package com.example.swipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private List<Video> videoList;
    private VideoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoList=new ArrayList<>();
        viewPager2 = findViewById(R.id.ViewPager2);

        videoList.add(new Video("android.resource://" + getPackageName() + "/" + R.raw.a, "New Title", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        videoList.add(new Video("android.resource://" + getPackageName() + "/" + R.raw.b, "New Title", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        videoList.add(new Video("android.resource://" + getPackageName() + "/" + R.raw.c, "New Title", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        videoList.add(new Video("android.resource://" + getPackageName() + "/" + R.raw.d, "New Title", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        videoList.add(new Video("android.resource://" + getPackageName() + "/" + R.raw.e, "New Title", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        videoList.add(new Video("android.resource://" + getPackageName() + "/" + R.raw.f, "New Title", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));

        adapter =new VideoAdapter(videoList);
        viewPager2.setAdapter(adapter);
    }
}