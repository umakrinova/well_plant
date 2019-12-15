package com.example.my_plants;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FriendWindow extends AppCompatActivity {

    private static final String FRIEND_NAME = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);
        showPlant();
    }

    protected void showPlant() {
        Bundle extras = getIntent().getExtras();
        String plant_name;

        if (extras == null) {
            plant_name = "MySon";
        } else {
            plant_name = extras.getString(FRIEND_NAME, "Dasha");
        }
        final TextView textView = (TextView)findViewById(R.id.plant_name_window);
        textView.setText(plant_name);

    }

}
