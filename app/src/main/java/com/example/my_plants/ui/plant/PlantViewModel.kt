package com.example.my_plants.ui.plant

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import com.example.my_plants.Plant
import com.example.my_plants.R


class PlantViewModel : ViewModel() {

    private val plants = arrayOf(Plant("MySon", 2, "test"))

    var text: String? = null
        private set

    init {
        text = String()
        text = plants[0].name
    }
}