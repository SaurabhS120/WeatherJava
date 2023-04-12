package org.example.data.weather_api_impl;

import org.example.domain.model.WeatherModel;
import org.example.domain.repo.WeatherRepo;
import org.example.weather_api_ds.WeatherApiDS;
import org.example.weather_api_ds.remote.response.WeatherApiResponse;

public class WeatherApiRepoImpl implements WeatherRepo {
    WeatherApiDS WeatherApiDS = new WeatherApiDS();

    @Override
    public WeatherModel[] getWeather() {
        WeatherApiResponse response = WeatherApiDS.getWeather();
        if (response != null) {
            String cityName = response.getCityName();
            double temp = response.getTemp();
            return new WeatherModel[]{new WeatherModel(cityName, (int) temp)};
        }
        return new WeatherModel[]{new WeatherModel("dummy", 22)};
    }
}
