package org.example.logger;

import org.example.Weather;
import org.example.domain.model.WeatherModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ListLoggerTest {
    @Test
    void testListLogger() {
        WeatherModel[] weatherModels = new WeatherModel[]{
                new WeatherModel("pune", 20),
                new WeatherModel("mumbai", 30),
                new WeatherModel("hydrabad", 18),
        };
        ListLogger<WeatherModel, Weather> listLogger = new ListLogger<WeatherModel, Weather>(weatherModels, (ListLoggerTransformer<WeatherModel, Weather>) item -> new Weather(item.cityName, item.temp));
        assertArrayEquals(new Weather[]{
                new Weather("pune", 20),
                new Weather("mumbai", 30),
                new Weather("hydrabad", 18),
        }, listLogger.getChildLoggables().toArray());
    }
}