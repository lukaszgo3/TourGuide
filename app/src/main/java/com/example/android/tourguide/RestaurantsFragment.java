package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<CityObjects> objects = new ArrayList<CityObjects>();
        objects.add(new CityObjects(getString(R.string.restaurantsTittle1), getString(R.string.restaurantsInfo1), R.drawable.railway));
        objects.add(new CityObjects(getString(R.string.restaurantsTittle2), getString(R.string.restaurantsInfo2), R.drawable.railway));
        objects.add(new CityObjects(getString(R.string.restaurantsTittle3), getString(R.string.restaurantsInfo3), R.drawable.railway));
        objects.add(new CityObjects(getString(R.string.restaurantsTittle4), getString(R.string.restaurantsInfo4), R.drawable.railway));

        CityObjectsAdapter objectsAdapter = new CityObjectsAdapter(getActivity(), objects);

        ListView listView = (ListView) view.findViewById(R.id.listViewId);
        listView.setAdapter(objectsAdapter);

        return view;
    }
}
