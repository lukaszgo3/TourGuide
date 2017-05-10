package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<CityObjects> objects = new ArrayList<CityObjects>();
        objects.add(new CityObjects(getString(R.string.attractionsTittle1), getString(R.string.attractionsInfo1), R.drawable.railway));
        objects.add(new CityObjects(getString(R.string.attractionsTittle2), getString(R.string.attractionsInfo2), R.drawable.railway));
        objects.add(new CityObjects(getString(R.string.attractionsTittle3), getString(R.string.attractionsInfo3), R.drawable.railway));
        objects.add(new CityObjects(getString(R.string.attractionsTittle4), getString(R.string.attractionsInfo4), R.drawable.railway));
        objects.add(new CityObjects(getString(R.string.attractionsTittle5), getString(R.string.attractionsInfo5), R.drawable.railway));

        CityObjectsAdapter objectsAdapter = new CityObjectsAdapter(getActivity(), objects);

        ListView listView = (ListView) view.findViewById(R.id.listViewId);
        listView.setAdapter(objectsAdapter);

        return view;
    }
}
