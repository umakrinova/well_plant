package com.example.my_plants

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.TextView
//import kotlinx.android.synthetic.main.<layout_name>.*;

class PlantWindow : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plant_new_window)
        showPlant()
    }

    protected fun showPlant() {
        val extras = intent.extras
        val plant_name: String

        if (extras == null) {
            plant_name = "MySon"
        } else {
            plant_name = extras.getString(PLANT_NAME, "MySon")
        }
        val textView = findViewById(R.id.plant_name_window) as TextView
        textView.text = plant_name

    }

    companion object {

        private val PLANT_NAME = "total_count"
    }

}

