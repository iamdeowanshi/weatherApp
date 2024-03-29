package com.android.aaditya.weather.service.Forecast;

import com.android.aaditya.weather.base.Presenter;
import com.android.aaditya.weather.model.City;

/**
 * Created by aaditya on 10/21/17.
 */

public interface ForecastPresenter extends Presenter<ForecastViewInteractor> {

    void getForecast(City city);

    void getCurrentForecast(City city);

    void getTimeZoneForCity(City city);

}
