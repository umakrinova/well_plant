package com.example.my_plants.ui.plant;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.my_plants.Plant;
import com.example.my_plants.R;


public class PlantViewModel extends ViewModel {

    private Plant[] plants = {
            new Plant("MySon", 2, "test")
    };

    private String mText;

    public PlantViewModel() {
        mText = new String();
        mText = plants[0].getName();
    }

    public String getText() {return mText; }
}