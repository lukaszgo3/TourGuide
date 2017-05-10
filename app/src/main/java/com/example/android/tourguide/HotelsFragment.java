package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<CityObjects> objects = new ArrayList<CityObjects>();
        objects.add(new CityObjects(getString(R.string.hotelsTittle1), getString(R.string.hotelsInfo1), R.drawable.railway));
        objects.add(new CityObjects(getString(R.string.hotelsTittle2), getString(R.string.hotelsInfo2), R.drawable.desilva));
        objects.add(new CityObjects(getString(R.string.hotelsTittle3), getString(R.string.hotelsInfo3), R.drawable.festival_hotel));
        objects.add(new CityObjects(getString(R.string.hotelsTittle4), getString(R.string.hotelsInfo4), R.drawable.mercure_hotel));

        CityObjectsAdapter objectsAdapter = new CityObjectsAdapter(getActivity(), objects);

        ListView listView = (ListView) view.findViewById(R.id.listViewId);
        listView.setAdapter(objectsAdapter);

        return view;
    }
}
