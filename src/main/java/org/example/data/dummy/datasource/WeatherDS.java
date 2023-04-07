package org.example.data.dummy.datasource;

import org.example.data.dummy.entity.WeatherEntity;
import org.example.data.dummy.entity.WeatherResponseEntity;

public class WeatherDS {
    public WeatherResponseEntity getWeather() {
        return new WeatherResponseEntity(new WeatherEntity[]{
                WeatherEntity.builder()
                        .setCityName("Pune")
                        .setTemp(32)
                        .build(),
                WeatherEntity.builder()
                        .setCityName("Mumbai")
                        .setTemp(36)
                        .build(),
                WeatherEntity.builder()
                        .setCityName("Bangalore")
                        .setTemp(39)
                        .build(),
                WeatherEntity.builder()
                        .setCityName("Delhi")
                        .setTemp(28)
                        .build(),
        });
    }
}
