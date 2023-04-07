package org.example.data.dummy.entity;

import org.example.domain.model.BaseTransformer;
import org.example.domain.model.WeatherModel;

public class WeatherEntity implements BaseTransformer<WeatherModel> {
    final String cityName;
    final int temp;

    WeatherEntity(String cityName, int temp) {
        this.cityName = cityName;
        this.temp = temp;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public WeatherModel transform() {
        return new WeatherModel(cityName, temp);
    }

    public static class Builder {
        private String cityName = "";
        private int temp = 0;

        public Builder setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }

        public Builder setTemp(int temp) {
            this.temp = temp;
            return this;
        }

        public WeatherEntity build() {
            return new WeatherEntity(cityName, temp);
        }
    }
}
