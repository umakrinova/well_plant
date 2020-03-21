package com.example.my_plants.ui.friends

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

import com.example.my_plants.Friend
import com.example.my_plants.Plant
import com.example.my_plants.R
import com.example.my_plants.ui.friends.FriendAdapter
import com.example.my_plants.ui.plant.PlantAdapter

class FriendsFragment : Fragment() {


    private val friends = arrayOf(Friend("Dasha", R.drawable.dasha, "dasha@example.com"),
            Friend("Dasha", R.drawable.dasha, "dasha@example.com"))

    private var friendViewModel: com.example.my_plants.ui.friends.FriendsViewModel? = null

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        friendViewModel = ViewModelProviders.of(this).get(FriendsViewModel::class.java)

        val friendAdapter = FriendAdapter(requireContext(), friends)

        val root = inflater.inflate(R.layout.fragment_friend, container, false)
        val singleView = inflater.inflate(R.layout.single_friend, null)


        val textView = singleView.findViewById<TextView>(R.id.text_friend_name)

        val gridView = root.findViewById<GridView>(R.id.friend_grid)

        gridView.adapter = friendAdapter
        //textView.setText(plantViewModel.getText());

        return root
    }
}