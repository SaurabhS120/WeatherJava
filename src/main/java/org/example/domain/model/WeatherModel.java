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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof WeatherModel) {
            WeatherModel weatherModel = (WeatherModel) obj;
            return weatherModel.cityName.equals(cityName) && weatherModel.temp == temp;
        } else {
            return super.equals(obj);
        }
    }
}
