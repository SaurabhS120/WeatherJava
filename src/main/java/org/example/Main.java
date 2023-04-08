package org.example;

import org.example.domain.model.WeatherModel;
import org.example.domain.usecase.GetWeatherUsecase;
import org.example.domain.usecase.GetWeatherUsecaseParams;
import org.example.logger.*;
import org.example.logger.command_logger.CommandLogger;

public class Main {
    static DI di = new DI(RepoModes.OPEN_WEATHER_REPO);
    public static void main(String[] args) {
        Weather mumbaiWeather = new Weather("Mumbai", 30);
        Weather puneWeather = new Weather("Pune", 40);
        Weather bangloreWeather = new Weather("Bangalore", 12);
        Weather delhiWeather = new Weather("Delhi", 25);
        GetWeatherUsecase getWeatherUsecase = di.getWeatherUsecase();
        WeatherModel[] weatherModels = getWeatherUsecase.invoke(new GetWeatherUsecaseParams());
        LogMachine weatherLogMachine = new LogMachine(
                new CommandLogger(),
                new Logable[]{
                        new ParentLogable(
                                "Weather list from repo",
                                new WeatherListLogger(weatherModels)


                        ),
                        new ParentLogable(
                                "Weather list",
                                new MultilineChildLogable(new ChildLogable[]{
                                        mumbaiWeather,
                                        puneWeather,
                                        bangloreWeather,
                                        delhiWeather,
                                })


                        )
                }
        );
        weatherLogMachine.logAll();
        mumbaiWeather.temp = 34;
        puneWeather.temp = 24;
        bangloreWeather.temp = 51;
        delhiWeather.temp = 13;
        weatherLogMachine.logAll();
        mumbaiWeather.temp = 42;
        puneWeather.temp = 23;
        bangloreWeather.temp = 2;
        delhiWeather.temp = 14;
        weatherLogMachine.logAll();
    }
}

