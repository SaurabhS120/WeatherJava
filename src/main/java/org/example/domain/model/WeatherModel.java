package org.example.domain.model;

public class WeatherModel {
    public final String cityName;
    public final int temp;

    public WeatherModel(String cityName, int temp) {
        this.cityName = cityName;
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "WeatherModel(cityName : " + cityName + ",temp : " + temp + ")";
    }
}
