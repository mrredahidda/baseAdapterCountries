package com.example.baseadaptertp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CountriesAdapter extends BaseAdapter {
    final Context c;

    public CountriesAdapter(Context c) {
        this.c = c;
    }

    @Override
    public int getCount() {
        return Countries.lstCountries.size();
    }

    @Override
    public Object getItem(int i) {
        return Countries.lstCountries.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(c).inflate(R.layout.lv_item, viewGroup, false);
        }

        TextView name = view.findViewById(R.id.name);
        ImageView logo = view.findViewById(R.id.logo);
        TextView id = view.findViewById(R.id.id);
        TextView capitale = view.findViewById(R.id.capitale);
        TextView population = view.findViewById(R.id.population);

        Countries C = Countries.lstCountries.get(i);

        name.setText(C.getName());
        logo.setImageResource(C.getLogo());
        id.setText(String.valueOf(C.getId())); // Assuming id is not a string, convert to String
        capitale.setText(C.getCapitale());
        population.setText(String.valueOf(C.getPopulation()));

        return view;
    }
}
