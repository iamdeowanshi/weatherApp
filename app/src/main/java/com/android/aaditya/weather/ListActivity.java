package com.android.aaditya.weather;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.aaditya.weather.base.BaseActivity;
import com.android.aaditya.weather.model.City;
import com.daimajia.swipe.adapters.RecyclerSwipeAdapter;
import com.daimajia.swipe.util.Attributes;

import java.util.Arrays;
import java.util.List;
import java.util.Timer;

import butterknife.BindView;
import butterknife.ButterKnife;
import timber.log.Timber;

public class ListActivity extends Activity implements CityRecyclerViewAdapter.ItemClickListener{

    private List<String> cities = Arrays.asList("San Jose", "Mumbai");
    private CityRecyclerViewAdapter adapter;

    @BindView(R.id.recycler_view) RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);

        adapter = new CityRecyclerViewAdapter(this, cities, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClicked(City city) {
        Timber.d("Clicked");
    }
}