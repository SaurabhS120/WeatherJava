package org.example;

import org.example.domain.model.WeatherModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class WeatherListLoggerTest {
    @Test
    void weatherListLoggerTest() {
        WeatherModel[] weatherModels = new WeatherModel[]{
                new WeatherModel("pune", 20),
                new WeatherModel("mumbai", 30),
                new WeatherModel("hydrabad", 18),
        };
        WeatherListLogger listLogger = new WeatherListLogger(weatherModels);
        assertArrayEquals(new Weather[]{
                new Weather("pune", 20),
                new Weather("mumbai", 30),
                new Weather("hydrabad", 18),
        }, listLogger.getChildLoggables().toArray());
    }
}