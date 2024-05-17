package com.example.repeat_3_3_2d;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class BrandsViewHolder extends RecyclerView.ViewHolder {

    private TextView tvBrands;
    public BrandsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvBrands = itemView.findViewById(R.id.rv_brands);

    }

    public void onBind (String brandName){
        tvBrands.setText(brandName);

    }
}
