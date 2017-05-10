package com.example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CityObjectsAdapter extends ArrayAdapter<CityObjects> {

    public CityObjectsAdapter(Context context, ArrayList<CityObjects> objects){
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {

        View objectView = convertView;
        if(objectView == null){
            objectView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_layout, parent, false);
        }

        CityObjects currentObject = getItem(position);

        TextView titleText = (TextView) objectView.findViewById(R.id.tittleItemId);
        titleText.setText(currentObject.getmTittle());

        TextView infoText = (TextView) objectView.findViewById(R.id.infoItemId);
        infoText.setText(currentObject.getmInfo());

        ImageView imageView = (ImageView) objectView.findViewById(R.id.imageItemId);
        imageView.setImageResource(currentObject.getmImage());

        return objectView;
    }
}
