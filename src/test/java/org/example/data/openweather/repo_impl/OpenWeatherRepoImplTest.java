package org.example.data.openweather.repo_impl;

import org.example.DI;
import org.example.RepoModes;
import org.example.domain.model.WeatherModel;
import org.example.domain.repo.WeatherRepo;
import org.example.domain.usecase.GetWeatherUsecase;
import org.example.domain.usecase.GetWeatherUsecaseParams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OpenWeatherRepoImplTest {

    @Test
    void openWeatherRepoImplTest() {
        DI di = new DI(RepoModes.OPEN_WEATHER_REPO);
        WeatherRepo weatherRepo = di.getWeatherRepo();
        GetWeatherUsecase getWeatherUsecase = di.getWeatherUsecase();
        GetWeatherUsecaseParams usecaseParams = new GetWeatherUsecaseParams();
        Assertions.assertTrue(usecaseParams.verify());
        WeatherModel[] weatherModels = getWeatherUsecase.invoke(usecaseParams);
        WeatherModel[] unExpectedResult = new WeatherModel[]{new WeatherModel("dummy", 22)};
        assertTrue(weatherModels.length > 0);
        assertNotEquals(unExpectedResult[0].cityName, weatherModels[0].cityName);
        assertNotEquals(unExpectedResult[0].temp, weatherModels[0].temp);
    }
}