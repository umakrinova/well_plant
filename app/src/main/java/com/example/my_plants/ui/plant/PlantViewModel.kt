package com.example.my_plants.ui.plant

import androidx.lifecycle.ViewModel
import com.example.my_plants.PlantsProvider


class PlantViewModel : ViewModel() {

    private val plants = PlantsProvider.plants

    var text: String? = null
        private set

    init {
        text = String()
        text = "test"//plants[0].name
    }
}