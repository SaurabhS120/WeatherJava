package org.example.domain.repo;

import org.example.domain.model.WeatherModel;

public interface WeatherRepo {
    WeatherModel[] getWeather();
}
