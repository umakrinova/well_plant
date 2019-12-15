package com.example.my_plants;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PlantWindow extends AppCompatActivity {

    private static final String PLANT_NAME = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plant_new_window);
        showPlant();
    }

    protected void showPlant() {
        Bundle extras = getIntent().getExtras();
        String plant_name;

        if (extras == null) {
            plant_name = "MySon";
        } else {
            plant_name = extras.getString(PLANT_NAME, "MySon");
        }
        final TextView textView = (TextView)findViewById(R.id.plant_name_window);
        textView.setText(plant_name);

    }

}

