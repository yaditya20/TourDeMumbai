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
public class HotelsFragment extends Fragment {

    /*private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;*/

    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getContext().getString(R.string.taj_mahal_name), getContext().getString(R.string.taj_mahal_time), getContext().getString(R.string.taj_mahal_phoneNo), getContext().getString(R.string.taj_mahal_address), getContext().getString(R.string.taj_mahal_sd), R.drawable.taj_hotel));
        places.add(new Place(getContext().getString(R.string.trident_hotel_bkc_name), getContext().getString(R.string.trident_hotel_bkc_time), getContext().getString(R.string.trident_hotel_bkc_phoneNo), getContext().getString(R.string.trident_hotel_bkc_address), getContext().getString(R.string.trident_hotel_bkc_sd), R.drawable.trident_hotel_bkc));
        places.add(new Place(getContext().getString(R.string.jw_marriott_mumbai_sahar_airport_name), getContext().getString(R.string.jw_marriott_mumbai_sahar_airport_time), getContext().getString(R.string.jw_marriott_mumbai_sahar_airport_phoneNo), getContext().getString(R.string.jw_marriott_mumbai_sahar_airport_address), getContext().getString(R.string.jw_marriott_mumbai_sahar_airport_sd), R.drawable.jw_marriott_mumbai_sahar_airport));
        places.add(new Place(getContext().getString(R.string.courtyard_by_marriott_mumbai_international_airport_name), getContext().getString(R.string.courtyard_by_marriott_mumbai_international_airport_time), getContext().getString(R.string.courtyard_by_marriott_mumbai_international_airport_phoneNo), getContext().getString(R.string.courtyard_by_marriott_mumbai_international_airport_address), getContext().getString(R.string.courtyard_by_marriott_mumbai_international_airport_sd) , R.drawable.courtyard_by_marriott_mumbai_international_airport));
        places.add(new Place(getContext().getString(R.string.itc_maratha_mumbai_name), getContext().getString(R.string.itc_maratha_mumbai_time), getContext().getString(R.string.itc_maratha_mumbai_phoneNo), getContext().getString(R.string.itc_maratha_mumbai_address), getContext().getString(R.string.itc_maratha_mumbai_sd), R.drawable.itc_maratha_mumbai));
        places.add(new Place(getContext().getString(R.string.hyatt_regency_name), getContext().getString(R.string.hyatt_regency_time), getContext().getString(R.string.hyatt_regency_phoneNo), getContext().getString(R.string.hyatt_regency_address), getContext().getString(R.string.hyatt_regency_sd),R.drawable.hyatt_regency));
        places.add(new Place(getContext().getString(R.string.the_westin_mumbai_garden_city_name), getContext().getString(R.string.the_westin_mumbai_garden_city_time), getContext().getString(R.string.the_westin_mumbai_garden_city_phoneNo), getContext().getString(R.string.the_westin_mumbai_garden_city_address), getContext().getString(R.string.the_westin_mumbai_garden_city_sd),R.drawable.the_westin_mumbai_garden_city));
        places.add(new Place(getContext().getString(R.string.renaissance_mumbai_convention_centre_hotel_name), getContext().getString(R.string.renaissance_mumbai_convention_centre_hotel_time), getContext().getString(R.string.renaissance_mumbai_convention_centre_hotel_phoneNo), getContext().getString(R.string.renaissance_mumbai_convention_centre_hotel_address), getContext().getString(R.string.renaissance_mumbai_convention_centre_hotel_sd),R.drawable.renaissance_mumbai_convention_centre_hotel));
        places.add(new Place(getContext().getString(R.string.the_lalit_mumbai_airport_name), getContext().getString(R.string.the_lalit_mumbai_airport_time), getContext().getString(R.string.the_lalit_mumbai_airport_phoneNo), getContext().getString(R.string.the_lalit_mumbai_airport_address), getContext().getString(R.string.the_lalit_mumbai_airport_sd),R.drawable.the_lalit_mumbai_airport));
        places.add(new Place(getContext().getString(R.string.taj_lands_end_name), getContext().getString(R.string.taj_lands_end_time), getContext().getString(R.string.taj_lands_end_phoneNo), getContext().getString(R.string.taj_lands_end_address), getContext().getString(R.string.taj_lands_end_sd),R.drawable.taj_lands_end));

        /*
        //Trying with RecyclerView
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
