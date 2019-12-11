package com.example.my_plants.ui.plant;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.my_plants.R;

public class PlantFragment extends Fragment {

    private com.example.my_plants.ui.dashboard.PlantViewModel plantViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        plantViewModel =
                ViewModelProviders.of(this).get(com.example.my_plants.ui.dashboard.PlantViewModel.class);
        View root = inflater.inflate(R.layout.fragment_plant, container, false);
        final TextView textView = root.findViewById(R.id.text_plant_name);
        plantViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}