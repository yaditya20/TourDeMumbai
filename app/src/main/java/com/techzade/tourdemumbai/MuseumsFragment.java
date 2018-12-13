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
public class MuseumsFragment extends Fragment {

    /*
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    */

    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getContext().getString(R.string.national_gallery_of_modern_art_mumbai_name), getContext().getString(R.string.national_gallery_of_modern_art_mumbai_time), getContext().getString(R.string.national_gallery_of_modern_art_mumbai_phoneNo), getContext().getString(R.string.national_gallery_of_modern_art_mumbai_address), getContext().getString(R.string.taj_mahal_sd), R.drawable.national_gallery_of_modern_art_mumbai));
        places.add(new Place(getContext().getString(R.string.chemould_prescott_road_name), getContext().getString(R.string.chemould_prescott_road_time), getContext().getString(R.string.chemould_prescott_road_phoneNo), getContext().getString(R.string.chemould_prescott_road_address), getContext().getString(R.string.chemould_prescott_road_sd), R.drawable.chemould_prescott_road));
        places.add(new Place(getContext().getString(R.string.project88_name), getContext().getString(R.string.project88_time), getContext().getString(R.string.project88_phoneNo), getContext().getString(R.string.project88_address), getContext().getString(R.string.project88_sd), R.drawable.project88));
        places.add(new Place(getContext().getString(R.string.volte_gallery_mumbai_name), getContext().getString(R.string.volte_gallery_mumbai_time), getContext().getString(R.string.volte_gallery_mumbai_phoneNo), getContext().getString(R.string.volte_gallery_mumbai_address), getContext().getString(R.string.volte_gallery_mumbai_sd), R.drawable.volte_gallery_mumbai));
        places.add(new Place(getContext().getString(R.string.jehangir_art_gallery_name), getContext().getString(R.string.jehangir_art_gallery_time), getContext().getString(R.string.jehangir_art_gallery_phoneNo), getContext().getString(R.string.jehangir_art_gallery_address), getContext().getString(R.string.jehangir_art_gallery_sd), R.drawable.jehangir_art_gallery));

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
