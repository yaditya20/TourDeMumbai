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
public class KidsFriendlyFragment extends Fragment {

    /*private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;*/

    public KidsFriendlyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getContext().getString(R.string.essel_world_name), getContext().getString(R.string.essel_world_time), getContext().getString(R.string.essel_world_phoneNo), getContext().getString(R.string.essel_world_address), getContext().getString(R.string.taj_mahal_sd), R.drawable.essel_world));
        places.add(new Place(getContext().getString(R.string.juhu_beach_name), getContext().getString(R.string.juhu_beach_time), getContext().getString(R.string.juhu_beach_phoneNo), getContext().getString(R.string.juhu_beach_address), getContext().getString(R.string.juhu_beach_sd), R.drawable.juhu_beach));
        places.add(new Place(getContext().getString(R.string.pagoda_name), getContext().getString(R.string.pagoda_time), getContext().getString(R.string.pagoda_phoneNo), getContext().getString(R.string.pagoda_address), getContext().getString(R.string.pagoda_sd), R.drawable.pagoda));
        places.add(new Place(getContext().getString(R.string.hanging_garden_name), getContext().getString(R.string.hanging_garden_time), getContext().getString(R.string.hanging_garden_phoneNo), getContext().getString(R.string.hanging_garden_address), getContext().getString(R.string.hanging_garden_sd), R.drawable.hanging_garden));
        places.add(new Place(getContext().getString(R.string.taraporevala_aquarium_name), getContext().getString(R.string.taraporevala_aquarium_time), getContext().getString(R.string.taraporevala_aquarium_phoneNo), getContext().getString(R.string.taraporevala_aquarium_address), getContext().getString(R.string.hanging_garden_sd), R.drawable.taraporevala_aquarium));
        places.add(new Place(getContext().getString(R.string.water_kingdom_name), getContext().getString(R.string.water_kingdom_time), getContext().getString(R.string.water_kingdom_phoneNo), getContext().getString(R.string.water_kingdom_address), getContext().getString(R.string.water_kingdom_sd), R.drawable.water_kingdom));
        places.add(new Place(getContext().getString(R.string.veermata_jijabai_udyan_name), getContext().getString(R.string.veermata_jijabai_udyan_time), getContext().getString(R.string.veermata_jijabai_udyan_phoneNo), getContext().getString(R.string.veermata_jijabai_udyan_address), getContext().getString(R.string.veermata_jijabai_udyan_sd), R.drawable.veermata_jijabai_udyan));
        places.add(new Place(getContext().getString(R.string.evershine_dream_park_name), getContext().getString(R.string.evershine_dream_park_time), getContext().getString(R.string.evershine_dream_park_phoneNo), getContext().getString(R.string.evershine_dream_park_address), getContext().getString(R.string.evershine_dream_park_sd), R.drawable.evershine_dream_park));
        places.add(new Place(getContext().getString(R.string.shivaji_park_name), getContext().getString(R.string.shivaji_park_time), getContext().getString(R.string.shivaji_park_phoneNo), getContext().getString(R.string.shivaji_park_address), getContext().getString(R.string.shivaji_park_sd), R.drawable.shivaji_park));

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
