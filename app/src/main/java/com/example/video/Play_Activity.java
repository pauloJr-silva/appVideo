package com.example.video;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Play_Activity extends AppCompatActivity {

    private VideoView videoView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        videoView = findViewById(R.id.videoView);

        //configurar os controles do videos
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoPath("android.resource://"+ getPackageName() + "/" + R.raw.video);
        videoView.start();



    }
}