package org.example;

import org.example.data.dummy.repo_impl.DummyWeatherRepoImpl;
import org.example.data.openweather.repo_impl.OpenWeatherRepoImpl;
import org.example.data.weather_api_impl.WeatherApiRepoImpl;
import org.example.domain.repo.WeatherRepo;
import org.example.domain.usecase.GetWeatherUsecase;

interface BaseDI {
    WeatherRepo getWeatherRepo();

    GetWeatherUsecase getWeatherUsecase();
}

public class DI implements BaseDI {
    BaseDI diObj;

    public DI(RepoModes mode) {
        switch (mode) {
            case DUMMY_REPO:
                diObj = new DummyDI();
                break;
            case OPEN_WEATHER_REPO:
                diObj = new OpenWeatherDI();
                break;
            case WEATHER_API_REPO:
                diObj = new WeatherApiDI();
                break;
        }
    }

    @Override
    public WeatherRepo getWeatherRepo() {
        return diObj.getWeatherRepo();
    }

    @Override
    public GetWeatherUsecase getWeatherUsecase() {
        return diObj.getWeatherUsecase();
    }
}

class DummyDI implements BaseDI {

    @Override
    public WeatherRepo getWeatherRepo() {
        return new DummyWeatherRepoImpl();
    }

    @Override
    public GetWeatherUsecase getWeatherUsecase() {
        return new GetWeatherUsecase(getWeatherRepo());
    }
}


class OpenWeatherDI implements BaseDI {

    @Override
    public WeatherRepo getWeatherRepo() {
        return new OpenWeatherRepoImpl();
    }

    @Override
    public GetWeatherUsecase getWeatherUsecase() {
        return new GetWeatherUsecase(getWeatherRepo());
    }
}

class WeatherApiDI implements BaseDI {

    @Override
    public WeatherRepo getWeatherRepo() {
        return new WeatherApiRepoImpl();
    }

    @Override
    public GetWeatherUsecase getWeatherUsecase() {
        return new GetWeatherUsecase(getWeatherRepo());
    }
}

