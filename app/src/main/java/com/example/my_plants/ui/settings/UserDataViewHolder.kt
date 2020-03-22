package com.example.my_plants.ui.settings

import android.service.autofill.UserData
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.my_plants.Friend
import com.example.my_plants.FriendsProvider
import com.example.my_plants.R

class UserDataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)  {
    fun bind(userData: Friend) {
        val photoView = itemView.findViewById<ImageView>(R.id.friend_photo)
        val nameView = itemView.findViewById<TextView>(R.id.friend_name)
        nameView.text = userData.name
        photoView.setImageResource(userData.imageSource)
    }
}