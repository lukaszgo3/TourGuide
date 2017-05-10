package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<CityObjects> objects = new ArrayList<CityObjects>();
        objects.add(new CityObjects(getString(R.string.shopTittle1), getString(R.string.shopInfo1), R.drawable.solaris));
        objects.add(new CityObjects(getString(R.string.shopTittle2), getString(R.string.shopInfo2), R.drawable.karolinka));
        objects.add(new CityObjects(getString(R.string.shopTittle3), getString(R.string.shopInfo3), R.drawable.turawa_park));

        CityObjectsAdapter objectsAdapter = new CityObjectsAdapter(getActivity(), objects);

        ListView listView = (ListView) view.findViewById(R.id.listViewId);
        listView.setAdapter(objectsAdapter);

        return view;
    }
}
