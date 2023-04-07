package org.example.domain.usecase;

import org.example.domain.model.WeatherModel;
import org.example.domain.repo.WeatherRepo;

public class GetWeatherUsecase implements BaseUsecase<WeatherModel[], GetWeatherUsecaseParams> {
    WeatherRepo repo;

    GetWeatherUsecase(WeatherRepo repo) {
        this.repo = repo;
    }

    @Override
    public WeatherModel[] invoke(GetWeatherUsecaseParams getWeatherUsecaseParams) {
        return repo.getWeather();
    }
}