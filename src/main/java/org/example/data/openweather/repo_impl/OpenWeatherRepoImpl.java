package org.example.data.openweather.repo_impl;

import org.example.domain.model.WeatherModel;
import org.example.domain.repo.WeatherRepo;
import org.example.open_weather_2_5_ds.OpenWeatherDS;
import org.example.open_weather_2_5_ds.response.current_weather.OpenWeatherResponse;

public class OpenWeatherRepoImpl implements WeatherRepo {
    OpenWeatherDS openWeatherDS = new OpenWeatherDS();

    @Override
    public WeatherModel[] getWeather() {
        OpenWeatherResponse response = openWeatherDS.getWeather();
        if (response != null) {
            System.out.println("response != null");
            String cityName = response.getCityName();
            double temp = response.getTemp();
            return new WeatherModel[]{new WeatherModel(cityName, (int) temp)};
        }
        System.out.println("response == null");
        return new WeatherModel[]{new WeatherModel("dummy", 22)};
    }
}
