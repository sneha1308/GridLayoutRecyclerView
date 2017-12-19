package com.recycler.servicecategory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview_rv);

        List<CategoryModel> categoryModels = new ArrayList<>();


        CategoryModel maintenance = new CategoryModel(R.drawable.filled_circle, "Maintenance");
        CategoryModel repairing = new CategoryModel(R.drawable.filled_circle, "Repairing");
        CategoryModel packages = new CategoryModel(R.drawable.filled_circle, "Packages");
        CategoryModel annualmaintenance = new CategoryModel(R.drawable.filled_circle, "Annual Maintenance");


        categoryModels.add(maintenance);
        categoryModels.add(repairing);
        categoryModels.add(packages);
        categoryModels.add(annualmaintenance);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        CategoryAdapter categoryAdapter = new CategoryAdapter(categoryModels);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(categoryAdapter);


    }
}
