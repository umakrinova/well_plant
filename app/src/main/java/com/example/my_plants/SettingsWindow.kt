package com.example.my_plants

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

class SettingsWindow : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_settings)
        showUserPhoto()
    }

    protected fun showUserPhoto() {

    }
}
