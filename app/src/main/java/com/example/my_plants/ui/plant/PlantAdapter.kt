package com.example.my_plants.ui.plant

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

import com.example.my_plants.Plant
import com.example.my_plants.R

import com.squareup.picasso.Picasso


class PlantAdapter// 1
(private val mContext: Context, private val plants: Array<Plant>) : BaseAdapter() {

    // 2
    override fun getCount(): Int {
        return plants.size
    }

    // 3
    override fun getItemId(position: Int): Long {
        return 0
    }

    // 4
    override fun getItem(position: Int): Any? {
        return null
    }

    // 5
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView

        val plant = plants[position]

        // view holder pattern
        if (convertView == null) {
            val layoutInflater = LayoutInflater.from(mContext)
            convertView = layoutInflater.inflate(R.layout.single_plant, null)

            val imageViewCoverArt = convertView!!.findViewById<View>(R.id.imageview_cover_art) as ImageView
            val nameTextView = convertView.findViewById<View>(R.id.text_plant_name) as TextView

            val viewHolder = ViewHolder(nameTextView, imageViewCoverArt)
            convertView.tag = viewHolder
        }

        val viewHolder = convertView.tag as ViewHolder
        viewHolder.imageViewCoverArt.setImageResource(plant.imageResource)

        //Picasso.with(mContext).load(plant.getImageUrl()).into(viewHolder.imageViewCoverArt);
        viewHolder.nameTextView.text = plant.name

        return convertView
    }

    // Your "view holder" that holds references to each subview
    private inner class ViewHolder(val nameTextView: TextView, val imageViewCoverArt: ImageView)


}

