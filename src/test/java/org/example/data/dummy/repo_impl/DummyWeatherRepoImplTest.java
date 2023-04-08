package org.example.data.dummy.repo_impl;

import org.example.DI;
import org.example.RepoModes;
import org.example.domain.model.WeatherModel;
import org.example.domain.repo.WeatherRepo;
import org.example.domain.usecase.GetWeatherUsecase;
import org.example.domain.usecase.GetWeatherUsecaseParams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DummyWeatherRepoImplTest {
    @Test
    void dummyWeatherRepoTest() {
        DI di = new DI(RepoModes.DUMMY_REPO);
        WeatherRepo weatherRepo = di.getWeatherRepo();
        GetWeatherUsecase getWeatherUsecase = di.getWeatherUsecase();
        GetWeatherUsecaseParams usecaseParams = new GetWeatherUsecaseParams();
        Assertions.assertTrue(usecaseParams.verify());
        WeatherModel[] weatherModels = getWeatherUsecase.invoke(usecaseParams);
        WeatherModel[] expectedResult = new WeatherModel[]{new WeatherModel("Pune", 32), new WeatherModel("Mumbai", 36), new WeatherModel("Bangalore", 39), new WeatherModel("Delhi", 28)};
        assertArrayEquals(expectedResult, weatherModels);
    }
}