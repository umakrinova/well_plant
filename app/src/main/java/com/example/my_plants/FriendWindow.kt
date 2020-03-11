package com.example.my_plants

import android.os.Bundle
import android.view.View
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity

class FriendWindow : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)
        showPlant()
    }

    protected fun showPlant() {
        val extras = intent.extras
        val plant_name: String

        if (extras == null) {
            plant_name = "MySon"
        } else {
            plant_name = extras.getString(FRIEND_NAME, "Dasha")
        }
        val textView = findViewById<View>(R.id.plant_name_window) as TextView
        textView.text = plant_name

    }

    companion object {

        private val FRIEND_NAME = "total_count"
    }

}
