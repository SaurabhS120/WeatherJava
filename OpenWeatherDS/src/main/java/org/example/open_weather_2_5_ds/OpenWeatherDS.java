package org.example.open_weather_2_5_ds;

import org.example.open_weather_2_5_ds.response.current_weather.OpenWeatherResponse;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class OpenWeatherDS {

    //This open weather API key will be fetched from environment variable OPEN_WEATHER_API_KEY
    private static String API_KEY = System.getenv("OPEN_WEATHER_API_KEY");

    final OpenWeatherApiInterface openWeatherApiClient = OpenWeatherRetrofitApiProvider.getRetrofitApi();

    public OpenWeatherResponse getWeather() {
        double lat = 44.34;
        double lon = 10.99;
        Call<OpenWeatherResponse> apiCall = openWeatherApiClient.getCurrentWeather(lat, lon, API_KEY);
        try {
            Response<OpenWeatherResponse> apiResponse = apiCall.execute();
            if (apiResponse.isSuccessful()) {
                OpenWeatherResponse openWeatherResponse = apiResponse.body();
                return openWeatherResponse;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
