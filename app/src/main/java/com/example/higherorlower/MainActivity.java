package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int RandomNumber=5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generateRandomNumbers()
    {
        Random rand = new Random();
        RandomNumber=rand.nextInt(20)+1;
    }

    public void btnclick(View view) {
        EditText guess =(EditText)findViewById(R.id.guessednumber);
        String message;

        int guessno =Integer.parseInt(guess.getText().toString());
        if(guessno > RandomNumber)
        {
            message="Lower!";
        }
        else if(guessno < RandomNumber)
        {
            message="Higher!";
        }
        else
        {
            message="You got it! Try again.";
            generateRandomNumbers();

        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();


    }
}