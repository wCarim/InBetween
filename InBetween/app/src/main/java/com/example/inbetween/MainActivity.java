package com.example.inbetween;

import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button startbutt, optbutt, helpbutt;
    //TextView mytv; --wag mo na muna tanggalin tong mga comments ah? yan ung para sa fonts ng ating app
    //Typeface myfont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mytv = (TextView) findViewById(R.id.appname);
        //myfont = Typeface.createFromAsset(this.getAssets(),"fonts/casino.3d-filled-marquee-regular.ttf");
        //mytv.setTypeface(myfont);


        startbutt = (Button) findViewById(R.id.startbutt);
        startbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        optbutt = (Button) findViewById(R.id.optbutt);
        optbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOptionsActivity();
            }
        });


        helpbutt = (Button) findViewById(R.id.helpbutt);
        helpbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelpActivity();
            }
        });


    }
    public void openActivity2() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void openHelpActivity() {
        Intent intent = new Intent(this, HelpActivity.class);
        startActivity(intent);
    }

    public void openOptionsActivity() {
        Intent intent = new Intent(this, OptionsActivity.class);
        startActivity(intent);
    }


}