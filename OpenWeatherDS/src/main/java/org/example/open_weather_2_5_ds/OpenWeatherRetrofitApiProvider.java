package org.example.open_weather_2_5_ds;

public class OpenWeatherRetrofitApiProvider {
    static OpenWeatherApiInterface openWeatherApiClient = null;

    static OpenWeatherApiInterface getRetrofitApi() {
        if (openWeatherApiClient == null) {
            openWeatherApiClient = new OpenWeatherApi().getClient();
        }
        return openWeatherApiClient;
    }
}
