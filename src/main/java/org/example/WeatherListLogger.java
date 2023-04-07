package org.example;

import org.example.domain.model.WeatherModel;
import org.example.logger.ListLogger;

public class WeatherListLogger extends ListLogger<WeatherModel, Weather> {
    public WeatherListLogger(WeatherModel[] list) {
        super(list, new WeatherListLoggerTransformer());
    }
}
