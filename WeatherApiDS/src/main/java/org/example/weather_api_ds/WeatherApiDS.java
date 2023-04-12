package org.example.weather_api_ds;

import org.example.weather_api_ds.remote.response.WeatherApiResponse;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class WeatherApiDS {

    //This Weather API key will be fetched from environment variable OPEN_WEATHER_API_KEY
    private static String API_KEY = System.getenv("WEATHER_API_KEY");

    final WeatherApiInterface weatherApiClient = WeatherApiRetrofitProvider.getRetrofitApi();

    public WeatherApiResponse getWeather() {
        String q = "paris";
        Call<WeatherApiResponse> apiCall = weatherApiClient.getCurrentWeather(API_KEY, q);
        try {
            Response<WeatherApiResponse> apiResponse = apiCall.execute();
            if (apiResponse.isSuccessful()) {
                WeatherApiResponse weatherApiResponse = apiResponse.body();
                return weatherApiResponse;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
