package org.example.data.dummy.repo_impl;

import org.example.data.dummy.datasource.WeatherDS;
import org.example.domain.model.WeatherModel;
import org.example.domain.repo.WeatherRepo;

public class DummyWeatherRepoImpl implements WeatherRepo {
    WeatherDS weatherDS = new WeatherDS();

    @Override
    public WeatherModel[] getWeather() {
        return weatherDS.getWeather().transform();
    }
}
