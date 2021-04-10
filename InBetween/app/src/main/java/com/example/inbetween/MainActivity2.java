package com.example.inbetween;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    private Button btnBet, btnFold, btnHigh, btnLow, btnReveal, btnNextRound, btnStart;
    private ImageView firstCard, secondCard, thirdCard;
    private TextView bet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

}