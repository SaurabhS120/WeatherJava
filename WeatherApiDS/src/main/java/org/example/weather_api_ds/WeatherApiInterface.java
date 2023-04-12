package org.example.weather_api_ds;

import org.example.weather_api_ds.remote.response.WeatherApiResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApiInterface {
    @GET("current.json")
    Call<WeatherApiResponse> getCurrentWeather(@Query("key") String key, @Query("q") String q);
}