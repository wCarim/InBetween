package com.example.inbetween;

import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class StartScreen extends AppCompatActivity {
    private Button btnStart, btnAboutUs, btnHelp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.start_screen);

        btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        btnAboutUs = (Button) findViewById(R.id.btnAboutUs);
        btnAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutUsActivity();
            }
        });

        btnHelp = (Button) findViewById(R.id.btnHelp);
        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelpActivity();
            }
        });


    }
    public void openActivity2() {
        Intent intent = new Intent(this, Game.class);
        startActivity(intent);
    }

    public void openHelpActivity() {
        Intent intent = new Intent(this, Help.class);
        startActivity(intent);
    }

    public void openAboutUsActivity() {
        Intent intent = new Intent(this, AboutGame.class);
        startActivity(intent);
    }


}