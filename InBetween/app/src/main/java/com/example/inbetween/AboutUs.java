package com.example.inbetween;

import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class AboutUs extends AppCompatActivity {
    MediaPlayer player;
    private Button btnHelp, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutUs);
    }
    public void play(View view){

        btnHelp = (Button) findViewById(R.id.btnHelp);
        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelpActivity();
            }
        });

        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    public void stop(View view){
        stopPlayer();
    }

    public void stopPlayer(){
        if (player != null){
            player.release();
            player = null;
            Toast.makeText(this, "MediaPlayer released", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }


    public void openHelpActivity() {
        Intent intent = new Intent(this, Help.class);
        startActivity(intent);
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, StartScreen.class);
        startActivity(intent);
    }
}