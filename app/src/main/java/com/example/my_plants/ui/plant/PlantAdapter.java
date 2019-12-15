package com.example.my_plants.ui.plant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.my_plants.Plant;
import com.example.my_plants.R;

import com.squareup.picasso.Picasso;


public class PlantAdapter extends BaseAdapter {

    private final Context mContext;
    private final Plant[] plants;

    // 1
    public PlantAdapter(Context context, Plant[] plants) {
        this.mContext = context;
        this.plants = plants;
    }

    // 2
    @Override
    public int getCount() {
        return plants.length;
    }

    // 3
    @Override
    public long getItemId(int position) {
        return 0;
    }

    // 4
    @Override
    public Object getItem(int position) {
        return null;
    }

    // 5
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Plant plant = plants[position];

        // view holder pattern
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.single_plant, null);

            final ImageView imageViewCoverArt = (ImageView)convertView.findViewById(R.id.imageview_cover_art);
            final TextView nameTextView = (TextView)convertView.findViewById(R.id.text_plant_name);

            final ViewHolder viewHolder = new ViewHolder(nameTextView, imageViewCoverArt);
            convertView.setTag(viewHolder);
        }

        final ViewHolder viewHolder = (ViewHolder)convertView.getTag();
        viewHolder.imageViewCoverArt.setImageResource(plant.getImageResource());

        //Picasso.with(mContext).load(plant.getImageUrl()).into(viewHolder.imageViewCoverArt);
        viewHolder.nameTextView.setText(plant.getName());

        return convertView;
    }

    // Your "view holder" that holds references to each subview
    private class ViewHolder {
        private final TextView nameTextView;
        private final ImageView imageViewCoverArt;

        public ViewHolder(TextView nameTextView, ImageView imageViewCoverArt){
            this.nameTextView = nameTextView;
            this.imageViewCoverArt = imageViewCoverArt;
        }
    }


}

