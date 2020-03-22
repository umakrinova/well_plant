package com.example.my_plants.ui.settings

import android.content.Context
import android.service.autofill.UserData
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.my_plants.Friend
import com.example.my_plants.R

class FriendsListAdapter (
        val context: Context,
        val userList: List<Friend>
) : RecyclerView.Adapter<UserDataViewHolder>()  {
    override fun getItemCount(): Int {
        return userList.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserDataViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val itemView = layoutInflater.inflate(R.layout.item_user_data, parent, false)
        return UserDataViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: UserDataViewHolder, position: Int) {
        holder.bind(userList[position])
    }
}