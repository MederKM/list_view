package com.example.meder.list_view;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Meder on 19.02.2018.
 */

class CustomArrayAdapter extends ArrayAdapter<Flat> {
    Context context;
    public CustomArrayAdapter(@NonNull Context context, int resource, @NonNull List<Flat> flats) {
        super(context, resource, flats);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view_item,parent,false);
        }

        Flat currentFlat = getItem(position);

        TextView addressTextView = itemView.findViewById(R.id.adress_text_view);
        TextView priceTextView = itemView.findViewById(R.id.price_text_view);
        TextView areaTextView = itemView.findViewById(R.id.area_text_view);
        TextView floorTextView = itemView.findViewById(R.id.floor_text_view);
        TextView totalFloorsTextView = itemView.findViewById(R.id.total_floors_text_view);
        TextView roomsTextView = itemView.findViewById(R.id.rooms_text_view);


        addressTextView.setText(currentFlat.getAddress());
        priceTextView.setText(currentFlat.getPrice() + " " + context.getResources().getString(R.string.som));
        areaTextView.setText(currentFlat.getArea());
        floorTextView.setText(currentFlat.getFloor());
        totalFloorsTextView.setText(currentFlat.getTotalFloors());
        roomsTextView.setText(currentFlat.getRooms());



        return  itemView;

    }
}
