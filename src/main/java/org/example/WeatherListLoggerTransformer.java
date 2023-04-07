package org.example;

import org.example.domain.model.WeatherModel;
import org.example.logger.ListLoggerTransformer;

public class WeatherListLoggerTransformer implements ListLoggerTransformer<WeatherModel, Weather> {

    @Override
    public Weather transform(WeatherModel item) {
        return new Weather(item.cityName, item.temp);
    }
}
