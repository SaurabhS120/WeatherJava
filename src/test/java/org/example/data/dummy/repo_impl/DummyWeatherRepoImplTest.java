package org.example.data.dummy.repo_impl;

import org.example.domain.model.WeatherModel;
import org.example.domain.repo.WeatherRepo;
import org.example.domain.usecase.GetWeatherUsecase;
import org.example.domain.usecase.GetWeatherUsecaseParams;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DummyWeatherRepoImplTest {
    @Test
    void dummyWeatherRepoTest() {
        WeatherRepo weatherRepo = new DummyWeatherRepoImpl();
        GetWeatherUsecase getWeatherUsecase = new GetWeatherUsecase(weatherRepo);
        WeatherModel[] weatherModels = getWeatherUsecase.invoke(new GetWeatherUsecaseParams());
        WeatherModel[] expectedResult = new WeatherModel[]{new WeatherModel("Pune", 32), new WeatherModel("Mumbai", 36), new WeatherModel("Bangalore", 39), new WeatherModel("Delhi", 28)};
        assertArrayEquals(expectedResult, weatherModels);
    }
}