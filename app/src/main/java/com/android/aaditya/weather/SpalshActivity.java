package com.android.aaditya.weather;

import android.os.Bundle;
import android.os.Handler;

import com.android.aaditya.weather.base.BaseActivity;
import com.android.aaditya.weather.model.City;
import com.android.aaditya.weather.util.WeatherPreferences;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpalshActivity extends BaseActivity implements ForecastViewInteractor {

    private WeatherPreferences preferences;
    private ForecastPresenter presenter;

    private Map<String, City> cities = new HashMap<>();
    private List<City> cityList;

    private int cityListSize = 0;
    private int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);

        preferences= new WeatherPreferences(this);
        cityList = preferences.readCityList();

        cityListSize = cityList.size();

        presenter = new ForecastPresenterImpl();
        presenter.attachViewInteractor(this);

        for (City city : cityList) {
            presenter.getForecast(city);
        }
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void onForecast(City city) {
        counter++;

        cities.put(city.getPlaceId(), city);
        cityList.clear();
        cityList.addAll(cities.values());

        if (counter == cityListSize)
            loadNextActivity();
    }

    @Override
    public void onCurrentForecast(City city) {

    }

    @Override
    public void onTimeZoneForCity(City city) {

    }

    private void loadNextActivity() {
        preferences.saveCityList(cityList);

        startActivity(CityListActivity.class,null);
        finish();
    }
}
