package org.example.weather_api_ds;

public class WeatherApiRetrofitProvider {
    static WeatherApiInterface weatherApiClient = null;

    static WeatherApiInterface getRetrofitApi() {
        if (weatherApiClient == null) {
            weatherApiClient = new WeatherApi().getClient();
        }
        return weatherApiClient;
    }
}
