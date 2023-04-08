package org.example.open_weather_2_5_ds.response.current_weather;

public class OpenWeatherResponse {
    private final String name;
    private final OpenWeatherResponseMain main;

    public OpenWeatherResponse(String name, OpenWeatherResponseMain main) {
        this.name = name;
        this.main = main;
    }

    public String getCityName() {
        return name;
    }

    public double getTemp() {
        return main.getTemp();
    }


}
