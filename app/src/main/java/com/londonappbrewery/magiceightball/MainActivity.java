package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] outcomes = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        final Button buttonAsk = findViewById(R.id.buttonAsk);
        final ImageView imageout= findViewById(R.id.imageAns);
        buttonAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n;
                Random randGenerator = new Random();
                n=randGenerator.nextInt(5);
                Log.d("8ball", "asked a answer-- Value:"+n);
                imageout.setImageResource(outcomes[n]);
            }
        });
    }
}
