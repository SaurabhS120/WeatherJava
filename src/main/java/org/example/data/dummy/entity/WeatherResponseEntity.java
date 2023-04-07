package org.example.data.dummy.entity;

import org.example.domain.model.BaseTransformer;
import org.example.domain.model.WeatherModel;

public class WeatherResponseEntity implements BaseTransformer<WeatherModel[]> {
    final WeatherEntity[] weatherEntities;

    public WeatherResponseEntity(WeatherEntity[] weatherEntities) {
        this.weatherEntities = weatherEntities;
    }

    @Override
    public WeatherModel[] transform() {
        WeatherModel[] weatherModels = new WeatherModel[weatherEntities.length];
        for (int i = 0; i < weatherEntities.length; i++) {
            weatherModels[i] = weatherEntities[i].transform();
        }
        return weatherModels;
    }
}
