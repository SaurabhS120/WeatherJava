package org.example.weather_api_ds.remote.response;

import com.google.gson.annotations.SerializedName;

public class WeatherApiResponse {

    @SerializedName("current")
    private Current current;

    @SerializedName("location")
    private Location location;

    public Current getCurrent() {
        return current;
    }

    public Location getLocation() {
        return location;
    }

    public String getCityName() {
        return getLocation().getName();
    }

    public double getTemp() {
        return getCurrent().getTempC();
    }
}