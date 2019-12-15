package com.example.my_plants.ui.plant;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.my_plants.Plant;
import com.example.my_plants.R;

public class PlantFragment extends Fragment {


    private Plant[] plants = {
            new Plant("MySon", 2, "test"),
            new Plant("Second Son", 1, "test")
    };

    private com.example.my_plants.ui.plant.PlantViewModel plantViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        plantViewModel =
                ViewModelProviders.of(this).get(com.example.my_plants.ui.plant.PlantViewModel.class);
        final PlantAdapter plantAdapter = new PlantAdapter(this.getContext(), plants);

        View root = inflater.inflate(R.layout.fragment_plant, container, false);
        View singleView = inflater.inflate(R.layout.single_plant, null);


        final TextView textView = singleView.findViewById(R.id.text_plant_name);

        final GridView gridView = root.findViewById(R.id.plant_grid);

        gridView.setAdapter(plantAdapter);
        //textView.setText(plantViewModel.getText());

        return root;
    }
}