package com.example.my_plants.ui.friends

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

import com.example.my_plants.Friend
import com.example.my_plants.Plant
import com.example.my_plants.R
import com.squareup.picasso.Picasso

//import com.squareup.picasso.Picasso;


class FriendAdapter// 1
(private val mContext: Context, private val friends: Array<Friend>) : BaseAdapter() {

    // 2
    override fun getCount(): Int {
        return friends.size
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

        val friend = friends[position]

        // view holder pattern
        if (convertView == null) {
            val layoutInflater = LayoutInflater.from(mContext)
            convertView = layoutInflater.inflate(R.layout.single_friend, null)
            val imageViewCoverArt = convertView!!.findViewById<View>(R.id.imageview_cover_art) as ImageView
            //final ImageView imageViewCoverArt = (ImageView)convertView.findViewById(R.id.imageview_cover_art);
            val nameTextView = convertView.findViewById<View>(R.id.text_friend_name) as TextView

            val viewHolder = ViewHolder(nameTextView, imageViewCoverArt)
            convertView.tag = viewHolder
        }

        val viewHolder = convertView.tag as ViewHolder
        viewHolder.imageViewCoverArt.setImageResource(friend.imageSource)

        // Picasso.with(mContext).load(friend.getImageUrl()).into(viewHolder.imageViewCoverArt);
        viewHolder.nameTextView.text = friend.name

        return convertView
    }

    // Your "view holder" that holds references to each subview
    private inner class ViewHolder(val nameTextView: TextView, val imageViewCoverArt: ImageView)//, ImageView imageViewCoverArt


}