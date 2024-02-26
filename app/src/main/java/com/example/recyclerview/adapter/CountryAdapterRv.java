package com.example.recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.MainActivity;
import com.example.recyclerview.R;

public class CountryAdapterRv extends RecyclerView.Adapter<CountryAdapterRv.dataHolder> {
    Context context;
    String[] country_name;
    String[] country_code;
    Integer[] flag;

    public CountryAdapterRv(Context context, String[] country_name, String[] country_code, Integer[] flag) {
        //Constructor
        this.context = context;
        this.country_name = country_name;
        this.country_code = country_code;
        this.flag = flag;
    }

    @NonNull
    @Override
    public dataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //View attech
        View view = LayoutInflater.from(context).inflate(R.layout.country_ui_tile, parent, false);
        return new dataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull dataHolder holder, int position) {
        //set
        holder.countryname.setText(country_name[position]);
        holder.countrycode.setText(country_code[position]);
        holder.imgfleg.setImageResource(flag[position]);

    }

    @Override
    public int getItemCount() {
        return country_name.length;
    }

    class dataHolder extends RecyclerView.ViewHolder {

        TextView countryname, countrycode;
        ImageView imgfleg;

        public dataHolder(@NonNull View itemView) {

            super(itemView);

            countryname = itemView.findViewById(R.id.countryname);
            countrycode = itemView.findViewById(R.id.countrycode);
            imgfleg = itemView.findViewById(R.id.imgfleg);
        }
    }
}
