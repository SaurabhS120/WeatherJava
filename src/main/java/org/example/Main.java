package org.example;

import org.example.domain.model.WeatherModel;
import org.example.domain.usecase.GetWeatherUsecase;
import org.example.domain.usecase.GetWeatherUsecaseParams;
import org.example.logger.LogMachine;
import org.example.logger.Logable;
import org.example.logger.ParentLogable;
import org.example.logger.command_logger.CommandLogger;

public class Main {
    static RepoModes repoMode = RepoModes.DUMMY_REPO;

    static void weatherPrint() {
        DI di = new DI(repoMode);
        GetWeatherUsecase getWeatherUsecase = di.getWeatherUsecase();
        WeatherModel[] weatherModels = getWeatherUsecase.invoke(new GetWeatherUsecaseParams());
        LogMachine weatherLogMachine = new LogMachine(
                new CommandLogger(),
                new Logable[]{
                        new ParentLogable(
                                "Weather list from repo : " + repoMode.name(),
                                new WeatherListLogger(weatherModels)


                        ),
                }
        );
        weatherLogMachine.logAll();
    }

    public static void main(String[] args) {
        weatherPrint();
        repoMode = RepoModes.OPEN_WEATHER_REPO;
        weatherPrint();
    }
}

