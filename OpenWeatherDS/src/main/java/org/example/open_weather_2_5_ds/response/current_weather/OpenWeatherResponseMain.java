package org.example.open_weather_2_5_ds.response.current_weather;

public class OpenWeatherResponseMain {
    private final double temp;

    public OpenWeatherResponseMain(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }
}
