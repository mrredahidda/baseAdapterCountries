package com.example.baseadaptertp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);

        Countries.lstCountries.add(new Countries(R.drawable.morocco,"Morocco","Rabat",212,37.08));
        Countries.lstCountries.add(new Countries(R.drawable.algeria,"Algeria","Alger",213,44.18));
        Countries.lstCountries.add(new Countries(R.drawable.scotland,"Scotland","Edimbourg",44,5.45));

        CountriesAdapter CA = new CountriesAdapter(getApplicationContext());

        lv.setAdapter(CA);

    }
}