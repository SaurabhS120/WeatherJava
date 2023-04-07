package org.example.domain.model;

public class WeatherModel {
    final String cityName;
    final int temp;

    public WeatherModel(String cityName, int temp) {
        this.cityName = cityName;
        this.temp = temp;
    }
}
