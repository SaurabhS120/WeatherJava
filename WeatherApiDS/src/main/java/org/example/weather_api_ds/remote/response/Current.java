package org.example.weather_api_ds.remote.response;

import com.google.gson.annotations.SerializedName;

public class Current {

    @SerializedName("uv")
    private double uv;

    @SerializedName("condition")
    private Condition condition;

    @SerializedName("temp_c")
    private double tempC;

    public double getUv() {
        return uv;
    }

    public Condition getCondition() {
        return condition;
    }

    public double getTempC() {
        return tempC;
    }
}