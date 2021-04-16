package com.example.inbetween;

import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class AboutGame extends AppCompatActivity {
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

        public void openMainActivity() {
            Intent intent = new Intent(this, StartScreen.class);
            startActivity(intent);
        }
}