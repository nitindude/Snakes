package com.example.nitin.snakes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] myDices= {
            R.drawable.one,
            R.drawable.two ,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six


    };

    public void rollTapped (View view){
        Button button = (Button) findViewById(R.id.rollButton);
        Log.i("button","button Tapped");
        Random ran = new Random();
        int randomNumber = ran.nextInt(6);
        Log.i("Random","Random number is " + randomNumber);

        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);

        imageView4.setImageResource(myDices[randomNumber]);
        imageView4.animate().rotationBy(180).setDuration(1000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
