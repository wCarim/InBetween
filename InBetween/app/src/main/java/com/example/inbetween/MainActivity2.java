package com.example.inbetween;

import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    private Button btnBet, btnFold, btnHigh, btnLow, btnReveal;
    private ImageView firstCard, secondCard, thirdCard, cross;
    private TextView bet;
    int money = 1000;       int card1;      int card2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        cross.setVisibility(View.GONE);
        btnBet = findViewById(R.id.btnBet);
        btnFold = findViewById(R.id.btnFold);
        btnHigh = findViewById(R.id.btnHigh);
        btnLow = findViewById(R.id.btnLow);
        btnReveal = findViewById(R.id.btnReveal);
        firstCard = findViewById(R.id.firstCard);
        secondCard = findViewById(R.id.secondCard);
        thirdCard = findViewById(R.id.thirdCard);
        bet = findViewById(R.id.bet);

        bet.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //Show cross button after start typing.
                cross.setVisibility(View.VISIBLE);
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
//        cross.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                bet.getText().clear();
//            }
//        });
        btnBet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        bet.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER){
                }
                return false; }});

    }
    private static final Integer[] cards = {
            R.drawable.cardace,
            R.drawable.card2,
            R.drawable.card3,
            R.drawable.card4,
            R.drawable.card5,
            R.drawable.card6,
            R.drawable.card7,
            R.drawable.card8,
            R.drawable.card9,
            R.drawable.card10,
            R.drawable.jack,
            R.drawable.queen,
            R.drawable.king
    };
    public static int randomInt() {
        Random rand = new Random();
        return rand.nextInt(13) + 1;
    }
}