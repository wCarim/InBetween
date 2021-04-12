package com.example.inbetween;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    private Button btnBet, btnFold, btnHigh, btnLow, btnReveal, btn20, btn50, btn70, btnRound;
    private ImageView firstCard;
    private ImageView thirdCard;
    private ImageView secondCard;
    private TextView betText;

    int money = 1000, bet = 0, first, second, third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        secondCard.setImageResource(R.drawable.back);
        firstCard.setImageResource(R.drawable.back);
        thirdCard.setImageResource(R.drawable.back);
        btnBet =     findViewById(R.id.btnBet);
        btnFold =    findViewById(R.id.btnFold);
        btnHigh =    findViewById(R.id.btnHigh);
        btnLow =     findViewById(R.id.btnLow);
        btnReveal =  findViewById(R.id.btnReveal);
        btnRound =   findViewById(R.id.btnRound);
        btn20 =      findViewById(R.id.btn20);
        btn50 =      findViewById(R.id.btn50);
        btn70 =      findViewById(R.id.btn70);
        firstCard =  findViewById(R.id.firstCard);
        secondCard = findViewById(R.id.secondCard);
        thirdCard =  findViewById(R.id.thirdCard);
        betText =    findViewById(R.id.bet);
        btnRound.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                first = randomInt();
                second = randomInt();
                third = randomInt();
                if (first + 1 == third || first-1 == third) {
                    first = randomInt();
                }
                btnBetVisible();
                btnBet.setEnabled(false);
                btnFoldVisible();
                btnRoundInvisible();
                btnRevealInvisible();
                btn20Visible();
                btn50Visible();
                btn70Visible();
                bet = 0;
                betText.setText("");
                betText.setHint("YOUR BET");
                secondCard.setImageResource(R.drawable.back);
                firstCard.setImageResource(cards(first));
                thirdCard.setImageResource(cards(third));
            }
        });

        btn20.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                bet += 20;
                btnBet.setEnabled(true);
                if (bet > money){
                    bet -= 20;
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getBaseContext());
                    builder.setTitle("ERROR").setNeutralButton("OK", null);
                    builder.setMessage("You can't bet more than what you have");
                }
                betText.setText(String.valueOf(bet));
            }
        });

        btn50.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                bet += 50;
                btnBet.setEnabled(true);
                if (bet > money){
                    bet -= 50;
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getBaseContext());
                    builder.setTitle("ERROR").setNeutralButton("OK", null);
                    builder.setMessage("You can't bet more than what you have");
                }

                betText.setText(String.valueOf(bet));
            }
        });
        btn70.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v) {
                bet += 70;
                btnBet.setEnabled(true);
                if (bet > money){
                    bet -= 70;
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getBaseContext());
                    builder.setTitle("ERROR").setNeutralButton("OK", null);
                    builder.setMessage("You can't bet more than what you have");
                    Log.e("status", "ERROR");
                }
                betText.setText(String.valueOf(bet));
            }
        });

        btnBet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        btnBetInvisible();
                        btnFoldInvisible();
                        btn20Invisible();
                        btn50Invisible();
                        btn70Invisible();
                        if (firstCard != thirdCard) {
                            btnRevealVisible();
                        } else {
                            btnHighVisible();
                            btnLowVisible();
                        }


            }
        });

        btnFold.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                btnBetInvisible();
                btnRoundVisible();
                btn20Invisible();
                btn50Invisible();
                btn70Invisible();


            }
        });

    }

    public void btnBetVisible()      {
        btnBet.setVisibility(View.VISIBLE);
    }
    public void btnBetInvisible()    {
        btnBet.setVisibility(View.GONE);
    }

    public void btnFoldVisible()     {
        btnFold.setVisibility(View.VISIBLE);
    }
    public void btnFoldInvisible()   {
        btnFold.setVisibility(View.GONE);
    }

    public void btnRevealVisible()   {
        btnReveal.setVisibility(View.VISIBLE);
    }
    public void btnRevealInvisible() {
        btnReveal.setVisibility(View.GONE);
    }

    public void btnRoundVisible()    {
        btnRound.setVisibility(View.VISIBLE);
    }
    public void btnRoundInvisible()  {
        btnRound.setVisibility(View.GONE);
    }

    public void btnHighVisible()     {
        btnHigh.setVisibility(View.VISIBLE);
    }
    public void btnHighInvisible()   {
        btnHigh.setVisibility(View.GONE);
    }

    public void btnLowVisible()      {
        btnLow.setVisibility(View.VISIBLE);
    }
    public void btnLowInvisible()    {
        btnLow.setVisibility(View.GONE);
    }

    public void btn20Visible()       {
        btn20.setVisibility(View.VISIBLE);
    }
    public void btn20Invisible()     {
        btn20.setVisibility(View.GONE);
    }

    public void btn50Visible()       {
        btn50.setVisibility(View.VISIBLE);
    }
    public void btn50Invisible()     {
        btn50.setVisibility(View.GONE);
    }

    public void btn70Visible()       {
        btn70.setVisibility(View.VISIBLE);
    }
    public void btn70Invisible()     {
        btn70.setVisibility(View.GONE); }

    public int cards(int n)          {
        Integer[] cards = {
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
        return cards[n];
    }
    public static int randomInt()    {
        Random rand = new Random();
        return rand.nextInt(13) + 1;
    }



}