package com.techzade.tourdemumbai;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TopSpotsFragment extends Fragment {

    /*private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;*/

    public TopSpotsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getContext().getString(R.string.cst_railway_station_name), getContext().getString(R.string.cst_railway_station_time), getContext().getString(R.string.cst_railway_station_phoneNo), getContext().getString(R.string.cst_railway_station_address), getContext().getString(R.string.cst_railway_station_sd), R.drawable.cst_railway_station));
        places.add(new Place(getContext().getString(R.string.haji_ali_name), getContext().getString(R.string.haji_ali_time), getContext().getString(R.string.haji_ali_phoneNo), getContext().getString(R.string.haji_ali_address), getContext().getString(R.string.haji_ali_sd), R.drawable.haji_ali));
        places.add(new Place(getContext().getString(R.string.essel_world_name), getContext().getString(R.string.essel_world_time), getContext().getString(R.string.essel_world_phoneNo), getContext().getString(R.string.essel_world_address), getContext().getString(R.string.taj_mahal_sd), R.drawable.essel_world));
        places.add(new Place(getContext().getString(R.string.siddhivinayak_temple_name), getContext().getString(R.string.siddhivinayak_temple_time), getContext().getString(R.string.siddhivinayak_temple_phoneNo), getContext().getString(R.string.siddhivinayak_temple_address), getContext().getString(R.string.siddhivinayak_temple_sd), R.drawable.siddhivinayak_temple));
        places.add(new Place(getContext().getString(R.string.pagoda_name), getContext().getString(R.string.pagoda_time), getContext().getString(R.string.pagoda_phoneNo), getContext().getString(R.string.pagoda_address), getContext().getString(R.string.pagoda_sd), R.drawable.pagoda));
        places.add(new Place(getContext().getString(R.string.taj_mahal_name), getContext().getString(R.string.taj_mahal_time), getContext().getString(R.string.taj_mahal_phoneNo), getContext().getString(R.string.taj_mahal_address), getContext().getString(R.string.taj_mahal_sd), R.drawable.taj_hotel));
        places.add(new Place(getContext().getString(R.string.taraporevala_aquarium_name), getContext().getString(R.string.taraporevala_aquarium_time), getContext().getString(R.string.taraporevala_aquarium_phoneNo), getContext().getString(R.string.taraporevala_aquarium_address), getContext().getString(R.string.hanging_garden_sd), R.drawable.taraporevala_aquarium));
        places.add(new Place(getContext().getString(R.string.jehangir_art_gallery_name), getContext().getString(R.string.jehangir_art_gallery_time), getContext().getString(R.string.jehangir_art_gallery_phoneNo), getContext().getString(R.string.jehangir_art_gallery_address), getContext().getString(R.string.jehangir_art_gallery_sd), R.drawable.jehangir_art_gallery));
        places.add(new Place(getContext().getString(R.string.sgnp_name), getContext().getString(R.string.sgnp_time), getContext().getString(R.string.sgnp_phoneNo), getContext().getString(R.string.sgnp_address), getContext().getString(R.string.sgnp_sd), R.drawable.sgnp));

        /*
        mRecyclerView = rootView.findViewById(R.id.recyclerView);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(rootView.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new PlaceAdapter(getActivity(), places);
        mRecyclerView.setAdapter(mAdapter);
        */

        PlaceAdapterLV adapter = new PlaceAdapterLV(getActivity(), places);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
