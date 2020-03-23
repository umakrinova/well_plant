package com.example.my_plants

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.CalendarView
import android.widget.ImageView
import android.widget.TextView
import java.util.*
import javax.xml.datatype.DatatypeConstants.MONTHS
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import java.time.LocalDate
import java.time.ZoneId
import java.time.format.DateTimeFormatter


class PlantWindow : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plant_new_window)
        showPlant()
    }

    protected fun showPlant() {
        val extras = intent.extras
        val plant_name: String
        val plant_image: Int
        val month: Int
        val day: Int

        if (extras == null) {
            plant_name = "MySon"
            plant_image = R.drawable.ic_close
            month = 4
            day = 1
        } else {
            plant_name = extras.getString("PLANT_NAME")!!
            plant_image = extras.getInt("PLANT_IMAGE")!!
            month = extras.getInt("PLANT_MONTH")!!
            day = extras.getInt("PLANT_DAY")!!
        }

        val textView = findViewById(R.id.plant_name_window) as TextView
        textView.text = plant_name

        val imageView =findViewById(R.id.imageview_plant) as ImageView
        imageView.setImageResource(plant_image)

        //val calendarView = findViewById(R.id.calendar_plant) as CalendarView
        //calendarView.setDate()

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        //val month = c.get(Calendar.MONTH)
        //val day = c.get(Calendar.DAY_OF_MONTH)


        val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener
        { view, year, monthOfYear, dayOfMonth ->

            // Display Selected date in textbox
            //lblDate.setText("" + dayOfMonth + " " + MONTHS[monthOfYear] + ", " + year)
        }, year, month, day)

        dpd.show()


    }


}

