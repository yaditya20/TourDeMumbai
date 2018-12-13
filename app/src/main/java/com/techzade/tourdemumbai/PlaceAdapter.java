package com.techzade.tourdemumbai;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder> {

    private Context mContext;
    private ArrayList<Place> mPlaceList;

    public PlaceAdapter(Context context, ArrayList<Place> placeList){
        this.mContext = context;
        this.mPlaceList = placeList;
    }

    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new PlaceViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        Place place = mPlaceList.get(position);
        holder.name.setText(place.getmName());
        holder.shortDescription.setText(place.getmShortDescription());
        holder.thumbnail.setImageResource(place.getmImageResourceId());
    }

    @Override
    public int getItemCount() {
        return mPlaceList.size();
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class PlaceViewHolder extends RecyclerView.ViewHolder{
        public TextView name, shortDescription;
        public ImageView thumbnail;
        public PlaceViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            shortDescription = itemView.findViewById(R.id.shortDescription);
            thumbnail = itemView.findViewById(R.id.thumbnail);
        }
    }

    /*public class PlaceAdapter extends ArrayAdapter {
    *//**
     * Constructor
     *
     * @param context  The current context.
     * @param places The Place for a layout file containing a List of places to use when
     *                 instantiating views.
     *//*
    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.recycler_view_layout, parent, false);
        }

        return listItemView;
    }*/
}
