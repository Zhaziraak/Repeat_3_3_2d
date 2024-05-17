package com.example.repeat_3_3_2d;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BrandAdapter extends RecyclerView.Adapter<BrandsViewHolder> {

    private ArrayList<String> brandList;

    public BrandAdapter(ArrayList<String> brandList) {
        this.brandList = brandList;
    }

    @NonNull
    @Override
    public BrandsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BrandsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_brands, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BrandsViewHolder holder, int position) {
        holder.onBind(brandList.get(position));


    }

    @Override
    public int getItemCount() {
        return brandList.size();
    }
}
