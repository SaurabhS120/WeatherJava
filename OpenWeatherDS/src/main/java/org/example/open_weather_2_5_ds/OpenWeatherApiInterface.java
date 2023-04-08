package org.example.open_weather_2_5_ds;

import org.example.open_weather_2_5_ds.response.current_weather.OpenWeatherResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenWeatherApiInterface {
    @GET("weather")
    Call<OpenWeatherResponse> getCurrentWeather(@Query("lat") double lat, @Query("lon") double lon, @Query("appid") String api_key);
}
