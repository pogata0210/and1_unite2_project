package com.example.and1_unite2_project;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
    Button playButton, pauseButton, stopButton;
    MediaPlayer mediaPlayer;
    int pausePosition;
    private Uri musicUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

    }


        public void play_song (View v)
        {
            MediaPlayer mediaPlayer = new MediaPlayer();
            try {
                mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/and1unite2project.appspot.com/o/aliciabessette_callersplace.mp3?alt=media&token=ed8009ed-8d30-45a9-8fd0-cac09152f530/");
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();

                    }
                });
                mediaPlayer.prepare();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }


}