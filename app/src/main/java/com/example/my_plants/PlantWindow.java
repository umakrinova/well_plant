package com.example.my_plants;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Random;

public class PlantWindow extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.fragment_home);
        showRandomNumber();
    }

    protected void showRandomNumber() {



        int count = getIntent().getIntExtra(TOTAL_COUNT, 0);

        Random random = new Random();

        int randomInt = 0;
        if (count>0) {
            randomInt = random.nextInt(count);
        }

        //randomView.setText(Integer.toString(randomInt));

        //headingView.setText(getString(R.string.random_heading, count));

    }

}

