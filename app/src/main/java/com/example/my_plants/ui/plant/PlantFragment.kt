package com.example.my_plants.ui.plant

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.GridView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.my_plants.*

import com.example.my_plants.PlantsProvider.Companion.plants

class PlantFragment : Fragment() {

    val plants = PlantsProvider.plants

    private var plantViewModel: com.example.my_plants.ui.plant.PlantViewModel? = null

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        plantViewModel = ViewModelProviders.of(this).get(PlantViewModel::class.java)
        val plantAdapter = PlantAdapter(requireContext(), plants)

        val root = inflater.inflate(R.layout.fragment_plant, container, false)
        val singleView = inflater.inflate(R.layout.single_plant, null)


        val textView = singleView.findViewById<TextView>(R.id.text_plant_name)

        val gridView = root.findViewById<GridView>(R.id.plant_grid)

        gridView.adapter = plantAdapter

        gridView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val plant = plants[position]

            val plantIntent = Intent(context, PlantWindow::class.java)
            plantIntent.putExtra("PLANT_NAME", plant.name)
            startActivity(plantIntent)

            plantAdapter.notifyDataSetChanged()
        }

        //textView.setText(plantViewModel.getText())

        return root
    }
}