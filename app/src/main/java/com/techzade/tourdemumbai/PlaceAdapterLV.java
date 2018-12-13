package com.techzade.tourdemumbai;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class PlaceAdapterLV extends ArrayAdapter<Place> {
    /**
     * Constructor
     *
     * @param context  The current context.
     * @param places The Place for a layout file containing a List of places to use when
     *instantiating views.
     */
    public PlaceAdapterLV(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Place currentPlace =  getItem(position);

        TextView name = listItemView.findViewById(R.id.name);
        name.setText(currentPlace.getmName());
        TextView shortDescription = listItemView.findViewById(R.id.shortDescription);
        shortDescription.setText(currentPlace.getmShortDescription());
        TextView address = listItemView.findViewById(R.id.address);
        address.setText(currentPlace.getmAddress());
        TextView phoneNo = listItemView.findViewById(R.id.phoneNo);
        phoneNo.setText(currentPlace.getmPhoneNo());
        //TextView website = listItemView.findViewById(R.id.website);
        //website.setText(currentPlace.getmWebsite());
        TextView time = listItemView.findViewById(R.id.time);
        time.setText(currentPlace.getmTime());
        ImageView thumbnail = listItemView.findViewById(R.id.thumbnail);
        thumbnail.setImageResource(currentPlace.getmImageResourceId());

        return listItemView;
    }
}
