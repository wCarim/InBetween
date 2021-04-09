package com.example.inbetween;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class HelpActivity extends AppCompatActivity {
    private Button link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        link = (Button) findViewById(R.id.linkbutt);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink();
            }
        });



    }

    public void openLink(){
        Uri kineme = Uri.parse("https://bicyclecards.com/how-to-play/in-between/");
        Intent i = new Intent(Intent.ACTION_VIEW, kineme);
        startActivity(i);
    }
}