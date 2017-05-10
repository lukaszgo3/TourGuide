package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class Fragment1 extends Fragment {

    public Fragment1(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<CityObjects> objects = new ArrayList<CityObjects>();
        objects.add(new CityObjects("tittle", "info", R.drawable. gollum ));
        objects.add(new CityObjects("tittle", "info", R.drawable. gollum ));
        objects.add(new CityObjects("tittle", "info", R.drawable. gollum ));
        objects.add(new CityObjects("tittle", "info", R.drawable. gollum ));
        objects.add(new CityObjects("tittle", "info", R.drawable. gollum ));
        objects.add(new CityObjects("tittle", "info", R.drawable. gollum ));
        objects.add(new CityObjects("tittle", "info", R.drawable. gollum ));

        CityObjectsAdapter objectsAdapter = new CityObjectsAdapter(getActivity(),objects);

        ListView listView = (ListView) view.findViewById(R.id.listViewId);
        listView.setAdapter(objectsAdapter);

        return view;
    }
}
