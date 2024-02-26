package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.adapter.CountryAdapterRv;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcView;
    String[] country_name = {"India","United States of America","Sri Lanka","South Africa","Spain","Singapore","Romania","Philippines","Maldives"};
    String[] country_code = {"IND","USA","LKA","ZAF", "ESP","SGP","ROU","PHL","MDV"};
    Integer[] fleg = {R.drawable.india,R.drawable.usa,R.drawable.sri_lanka,R.drawable.south_africa,R.drawable.spain,R.drawable.singapore,R.drawable.romania,R.drawable.philippines,R.drawable.maldives};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcView = findViewById(R.id.rvView);

        CountryAdapterRv adapterRv = new CountryAdapterRv(this,country_name,country_code,fleg);
        rcView.setAdapter(adapterRv);
        RecyclerView.LayoutManager layoutManager;
        layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcView.setLayoutManager(layoutManager);

    }
}