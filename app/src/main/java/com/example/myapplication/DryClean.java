package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class DryClean extends AppCompatActivity implements  RecycleViewOnItemClick{

    private List<Places> dry_clean = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dry_clean_click);
        RecyclerView recyclerView = findViewById(R.id.dry_clean_recycler);

        dry_clean.add(new Places("dry-clean1", R.drawable.dryclean1));
        dry_clean.add(new Places("dry-clean2", R.drawable.dryclean2));
        dry_clean .add(new Places("dry-clean3", R.drawable.dryclean3));
        dry_clean .add(new Places("dry-clean4", R.drawable.dryclean4));



        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        Adapter1 adapter = new Adapter1(dry_clean , this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(int position) {

    }

    @Override
    public void onLongItemClick(int position) {

    }
}