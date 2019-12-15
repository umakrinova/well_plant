package com.example.my_plants.ui.friends;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.my_plants.Friend;
import com.example.my_plants.Plant;
import com.example.my_plants.R;
import com.example.my_plants.ui.friends.FriendAdapter;
import com.example.my_plants.ui.plant.PlantAdapter;

public class FriendsFragment extends Fragment {


    private Friend[] friends = {
            new Friend("MyFriend", 2, "test"),
            new Friend("Second Friend", 1, "test")
    };

    private com.example.my_plants.ui.friends.FriendsViewModel friendViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        friendViewModel =
                ViewModelProviders.of(this).get(com.example.my_plants.ui.friends.FriendsViewModel.class);
        final FriendAdapter friendAdapter = new FriendAdapter(this.getContext(), friends);

        View root = inflater.inflate(R.layout.fragment_friend, container, false);
        View singleView = inflater.inflate(R.layout.single_friend, null);


        final TextView textView = singleView.findViewById(R.id.text_friend_name);

        final GridView gridView = root.findViewById(R.id.friend_grid);

        gridView.setAdapter(friendAdapter);
        //textView.setText(plantViewModel.getText());

        return root;
    }
}