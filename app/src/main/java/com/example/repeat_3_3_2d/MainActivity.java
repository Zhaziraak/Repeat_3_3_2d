package com.example.repeat_3_3_2d;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> brandsList = new ArrayList<>();
    private RecyclerView rvBrands;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvBrands = findViewById(R.id.rv_brands);
        brandsList.add("Chanel");
        brandsList.add("Adidas");
        brandsList.add("Zara");
        brandsList.add("Burberry");
        brandsList.add("Canon");
        brandsList.add("Lacoste");

        BrandAdapter adapter = new BrandAdapter(brandsList);
        rvBrands.setAdapter(adapter);
    }
}