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
public class LocalFavoritesFragment extends Fragment {
/*

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
*/

    public LocalFavoritesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getContext().getString(R.string.sgnp_name), getContext().getString(R.string.sgnp_time), getContext().getString(R.string.sgnp_phoneNo), getContext().getString(R.string.sgnp_address), getContext().getString(R.string.sgnp_sd), R.drawable.sgnp));
        places.add(new Place(getContext().getString(R.string.mahalaxmi_racecourse_mahalaxmi_mumbai_name), getContext().getString(R.string.mahalaxmi_racecourse_mahalaxmi_mumbai_time), getContext().getString(R.string.mahalaxmi_racecourse_mahalaxmi_mumbai_phoneNo), getContext().getString(R.string.mahalaxmi_racecourse_mahalaxmi_mumbai_address), getContext().getString(R.string.mahalaxmi_racecourse_mahalaxmi_mumbai_sd), R.drawable.mahalaxmi_racecourse_mahalaxmi_mumbai));
        places.add(new Place(getContext().getString(R.string.banganga_water_tank_name), getContext().getString(R.string.banganga_water_tank_time), getContext().getString(R.string.banganga_water_tank_phoneNo), getContext().getString(R.string.banganga_water_tank_address), getContext().getString(R.string.banganga_water_tank_sd), R.drawable.banganga_water_tank));
        places.add(new Place(getContext().getString(R.string.siddhivinayak_temple_name), getContext().getString(R.string.siddhivinayak_temple_time), getContext().getString(R.string.siddhivinayak_temple_phoneNo), getContext().getString(R.string.siddhivinayak_temple_address), getContext().getString(R.string.siddhivinayak_temple_sd), R.drawable.siddhivinayak_temple));
        places.add(new Place(getContext().getString(R.string.pagoda_name), getContext().getString(R.string.pagoda_time), getContext().getString(R.string.pagoda_phoneNo), getContext().getString(R.string.pagoda_address), getContext().getString(R.string.pagoda_sd), R.drawable.pagoda));

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
